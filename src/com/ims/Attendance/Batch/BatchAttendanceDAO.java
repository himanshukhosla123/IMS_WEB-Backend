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

	public int addAtt(BatchAttendanceDTO dto) throws ClassNotFoundException, SQLException {
		int recordCount = 0;
		StudentAttendanceDAO studentDAO = new StudentAttendanceDAO();
		for (StuStatus attStatus : dto.getStattSet()) {
			recordCount += studentDAO.addAtt(
					new StudentAttendanceDTO(attStatus.getsId(), dto.getbId(), dto.getDate(), attStatus.getStatus()));
		}
		return recordCount;

	}

	public BatchAttendanceDTO readAtt(BatchAttendanceDTO dto) throws Exception {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = CommonDAO.getConnection();
			pstm = con.prepareStatement(SqlQuery.READ_BATCH_ATT);
			int bId = dto.getbId();
			Date date = dto.getDate();
			pstm.setInt(1, bId);
			pstm.setDate(2, new java.sql.Date(date.getTime()));
			rs = pstm.executeQuery();
			BatchAttendanceDTO baDto = new BatchAttendanceDTO(bId, date);
			TreeSet<StuStatus> attStatus = baDto.getStattSet();
			while (rs.next()) {
				attStatus.add(new StuStatus(rs.getInt(1), rs.getString(4)));
			}
			baDto.setStattMap(attStatus);
			return baDto;
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
