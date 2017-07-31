package com.ims.Attendance.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.Utils.SqlQuery;

public class EmployeeAttendanceDAO {
	public boolean addEmployeeAttendance(EmployeeAttendanceDTO dto) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SqlQuery.ADD_EMPLOYEE_ATT);
			pstmt.setInt(1, dto.getEmployeeID());
			pstmt.setDate(2, new java.sql.Date(dto.getDate().getTime()));
			pstmt.setString(3, dto.getStatus());
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
	
	

	public ArrayList<EmployeeAttendanceDTO> readEmployeeAttendance(EmployeeAttendanceDTO dto) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<EmployeeAttendanceDTO> al=new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			pstm = con.prepareStatement(SqlQuery.READ_EMPLOYEE_ATT);
			pstm.setInt(1, dto.getEmployeeID());
			rs = pstm.executeQuery();
			if (rs.next()) {
				al.add(new EmployeeAttendanceDTO(rs.getInt(1), rs.getDate(2), rs.getString(3)));
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

	public boolean updateEmployeeAttendance(EmployeeAttendanceDTO dto) throws ClassNotFoundException, SQLException  {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SqlQuery.UPDATE_EMPLOYEE_ATT);
			pstmt.setInt(2, dto.getEmployeeID());
			pstmt.setDate(3, new java.sql.Date(dto.getDate().getTime()));
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
