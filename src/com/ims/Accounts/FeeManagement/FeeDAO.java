package com.ims.Accounts.FeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.IFee;

public class FeeDAO {
	
	public boolean addFee(FeeDTO feeDTO) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.CREATE_FEE);
			ps.setInt(1, feeDTO.getStudentId());
			ps.setInt(2, feeDTO.getCourseId());
			ps.setInt(3, feeDTO.getStuFeeID());
			ps.setString(4, feeDTO.getStatus());
			if(ps.executeUpdate() > 0) {
				return true;
			}
			else {
				return false;
			}
		}
		finally {
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
		}	
	}
	
	public ArrayList<FeeDTO> readFee() throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<FeeDTO> feeList = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.READ_FEE_ALL);
			rs = ps.executeQuery();
			while(rs.next()) {
				feeList.add(new FeeDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
			}
			return feeList;
		}
		finally {
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
		}
	}
	
	public boolean updateFee(FeeDTO feeDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.UPDATE_FEE);
			ps.setInt(1, feeDTO.getCourseId());
			ps.setString(2, feeDTO.getStatus());
			ps.setInt(3, feeDTO.getStuFeeID());
			if(ps.executeUpdate() > 0) {
				return true;
			}
			else {
				return false;
			}
		}
		finally {
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
		}
	}
	
	public boolean deleteFee(int stuFeeId) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.DELETE_FEE);
			ps.setInt(1, stuFeeId);
			if(ps.executeUpdate() > 0) {
				return true;
			}
			else {
				return false;
			}
		}
		finally {
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
		}
	}
	
	/*public boolean isAlreadyPaid() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = con.prepareStatement(SqlQuery.IF_FEE_PAID);
		return false;
	}*/
	
	/*public boolean isAlreadyExist() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = con.prepareStatement(IFee.IF_FEE_PAID);
		return false;
	}*/

}
