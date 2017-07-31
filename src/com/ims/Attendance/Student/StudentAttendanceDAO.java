package com.ims.Attendance.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.Utils.SqlQuery;

public class StudentAttendanceDAO {
	public boolean addStudentAttendance(StudentAttendanceDTO dto) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SqlQuery.ADD_STUDENT_ATT);
			pstmt.setInt(1, dto.getStudentID());
			pstmt.setInt(2, dto.getBatchID());
			pstmt.setDate(3, new java.sql.Date(dto.getDate().getTime()));
			pstmt.setString(4, dto.getStatus());
			if(pstmt.executeUpdate()>0){
				return true;
			}
			return false;
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}
	
	

	public ArrayList<StudentAttendanceDTO> readStudentAttendance(StudentAttendanceDTO dto) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<StudentAttendanceDTO> al=new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			pstm = con.prepareStatement(SqlQuery.READ_STUDENT_ATT);
			pstm.setInt(1, dto.getStudentID());
			pstm.setInt(2, dto.getBatchID());
			rs = pstm.executeQuery();
			if (rs.next()) {
				al.add(new StudentAttendanceDTO(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(4)));
			} 
			return al;
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

	public boolean updateStudentAttendance(StudentAttendanceDTO dto) throws ClassNotFoundException, SQLException  {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SqlQuery.UPDATE_STUDENT_ATT);
			pstmt.setInt(2, dto.getStudentID());
			pstmt.setInt(3, dto.getBatchID());
			pstmt.setDate(4, new java.sql.Date(dto.getDate().getTime()));
			pstmt.setString(1, dto.getStatus());
			if (pstmt.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

}
