package com.ims.Accounts.FeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.IFee;
import com.ims.Common.Utils.CustomDateFormat;

public class FeeDAO {
	
	public FeeDTO addFee(FeeDTO feeDTO) throws SQLException, ClassNotFoundException, ParseException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.CREATE_FEE);
			ps.setString(1, "101");
			ps.setString(2, feeDTO.getSID());
			ps.setString(3, feeDTO.getBID());
			ps.setString(4, "101");
			ps.setDouble(5, feeDTO.getCourseAmount());
			ps.setDouble(6, 101);
			ps.setString(7, feeDTO.getPaymentMode());
			ps.setString(8, "101");
			System.out.println(feeDTO);
			ps.setDate(9, new java.sql.Date(CustomDateFormat.getDate(feeDTO.getPaymentDate()).getTime()));
			ps.setDate(10, new java.sql.Date(CustomDateFormat.getDate(feeDTO.getPaymentDate()).getTime()));
			ps.setDouble(11, feeDTO.getPayment());
			ps.setDouble(12, feeDTO.getBalance());
			ps.setString(13, "101");
			if(ps.executeUpdate() > 0) {
				return feeDTO;
			}
			else {
				return null;
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
						rs.getDouble("Payable Amount"), rs.getString("Installment Date"), 
						rs.getDouble("Balance"), rs.getString("Status")));
			}
			System.out.println(feeList);
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
	
	public FeeDTO readFee(FeeDTO feeDTO) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.READ_FEE);
			ps.setString(1, "101");
			rs = ps.executeQuery();
			rs.next();
			feeDTO = new FeeDTO(rs.getString("TID"), rs.getString("SID"), rs.getString("BID"), rs.getString("CID"), 
					rs.getDouble("Course Amount"), rs.getDouble("Payable Amount"), rs.getString("Payment Mode"), 
					rs.getString("Cheque ID"), rs.getString("Payment Date"), rs.getString("Installment Date"), 
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
	
	public FeeDTO updateFee(FeeDTO feeDTO) throws ClassNotFoundException, SQLException, ParseException {
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
			ps.setDate(9, (java.sql.Date) CustomDateFormat.getDate(feeDTO.getPaymentDate()));
			ps.setDate(10, (java.sql.Date) CustomDateFormat.getDate(feeDTO.getInstallmentDate()));
			ps.setDouble(11, feeDTO.getPayment());
			ps.setDouble(12, feeDTO.getBalance());
			ps.setString(13, feeDTO.getStatus());
			ps.setString(14, feeDTO.getTID());
			if(ps.executeUpdate() > 0) {
				return feeDTO;
			}
			else {
				return null;
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
	
	public FeeDTO deleteFee(FeeDTO feeDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IFee.DELETE_FEE);
			ps.setString(1, feeDTO.getTID());
			if(ps.executeUpdate() > 0) {
				return feeDTO;
			}
			else {
				return null;
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

}
