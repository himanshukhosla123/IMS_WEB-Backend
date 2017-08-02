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
			ps.setString(1, feeDTO.getTID());
			ps.setString(2, feeDTO.getSID());
			ps.setString(3, feeDTO.getBID());
			ps.setString(4, feeDTO.getCID());
			ps.setDouble(5, feeDTO.getCourseAmount());
			ps.setDouble(6, feeDTO.getPayableAmount());
			ps.setString(7, feeDTO.getPaymentMode());
			ps.setString(8, feeDTO.getChequeId());
			ps.setDate(9, (java.sql.Date) feeDTO.getPaymentDate());
			ps.setDate(10, (java.sql.Date) feeDTO.getInstallmentDate());
			ps.setDouble(11, feeDTO.getPayment());
			ps.setDouble(12, feeDTO.getBalance());
			ps.setString(13, feeDTO.getStatus());
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
	
	public ArrayList<FeeDTO> readAllFee() throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<FeeDTO> feeList = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.READ_ALL_FEE);
			rs = ps.executeQuery();
			while(rs.next()) {
				feeList.add(new FeeDTO(rs.getString("TID"), rs.getString("SID"), rs.getString("CID"), 
						rs.getDouble("Payable Amount"), rs.getDate("Installment Date"), 
						rs.getDouble("Balance"), rs.getString("Status")));
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
	
	public FeeDTO readFee(String tID) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		FeeDTO feeDTO;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.READ_FEE);
			rs = ps.executeQuery();
			rs.next();
			feeDTO = new FeeDTO(rs.getString("TID"), rs.getString("SID"), rs.getString("BID"), rs.getString("CID"), 
					rs.getDouble("Course Amount"), rs.getDouble("Payable Amount"), rs.getString("Payment Mode"), 
					rs.getString("Cheque ID"), rs.getDate("Payment Date"), rs.getDate("Installment Date"), 
					rs.getDouble("Payment"), rs.getDouble("Balance"), rs.getString("Status"));
			return feeDTO;
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
			ps.setString(1, feeDTO.getTID());
			ps.setString(2, feeDTO.getSID());
			ps.setString(3, feeDTO.getBID());
			ps.setString(4, feeDTO.getCID());
			ps.setDouble(5, feeDTO.getCourseAmount());
			ps.setDouble(6, feeDTO.getPayableAmount());
			ps.setString(7, feeDTO.getPaymentMode());
			ps.setString(8, feeDTO.getChequeId());
			ps.setDate(9, (java.sql.Date) feeDTO.getPaymentDate());
			ps.setDate(10, (java.sql.Date) feeDTO.getInstallmentDate());
			ps.setDouble(11, feeDTO.getPayment());
			ps.setDouble(12, feeDTO.getBalance());
			ps.setString(13, feeDTO.getStatus());
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
	
	public boolean deleteFee(String tID) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.DELETE_FEE);
			ps.setString(1, tID);
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
