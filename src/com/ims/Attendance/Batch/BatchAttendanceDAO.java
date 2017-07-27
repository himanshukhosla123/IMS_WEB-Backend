package com.ims.Attendance.Batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.TreeSet;

import com.ims.Attendance.Student.StudentAttendanceDAO;
import com.ims.Attendance.Student.StudentAttendanceDTO;
import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.Utils.SqlQuery;

public class BatchAttendanceDAO {

	public int addBatchAttendance(BatchAttendanceDTO dto) throws ClassNotFoundException, SQLException {
		int recordCount = 0;
		StudentAttendanceDAO studentDAO = new StudentAttendanceDAO();
		for (StudentStatus studentStatus : dto.getStudentStatusSet()) {
			if(studentDAO.addStudentAttendance(new StudentAttendanceDTO(studentStatus.getStudentID(), dto.getBatchID(), dto.getDate(), studentStatus.getStatus()))){
				++recordCount;
			}
		}
		return recordCount;
	}

	public BatchAttendanceDTO readBatchAttendance(BatchAttendanceDTO dto) throws ClassNotFoundException, SQLException  {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = CommonDAO.getConnection();
			pstm = con.prepareStatement(SqlQuery.READ_BATCH_ATT);
			int batchID = dto.getBatchID();
			Date date = dto.getDate();
			pstm.setInt(1, batchID);
			pstm.setDate(2, new java.sql.Date(date.getTime()));
			rs = pstm.executeQuery();
			BatchAttendanceDTO batchAttendanceDTO = new BatchAttendanceDTO(batchID, date);
			TreeSet<StudentStatus> studentStatus = batchAttendanceDTO.getStudentStatusSet();
			while (rs.next()) {
				studentStatus.add(new StudentStatus(rs.getInt(1), rs.getString(4)));
			}
			batchAttendanceDTO.setStudentStatusSet(studentStatus);
			return batchAttendanceDTO;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (con != null) {
				con.close();
			}
		}

	}

}
