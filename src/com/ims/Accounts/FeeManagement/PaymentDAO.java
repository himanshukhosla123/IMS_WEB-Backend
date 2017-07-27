package com.ims.Accounts.FeeManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.IPayment;

public class PaymentDAO {
	
	public boolean addPayment(PaymentDTO paymentDTO) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.CREATE_PAYMENT);
			ps.setInt(1, paymentDTO.getStuFeeID());
			ps.setDouble(2, paymentDTO.getPayment());
			ps.setDate(3, (Date)paymentDTO.getPaymentDate());
			ps.setString(4, paymentDTO.getDueDate().toString()); // 2nd way
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
	
	public ArrayList<PaymentDTO> readPayment() throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<PaymentDTO> paymentList = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.READ_PAYMENT);
			rs = ps.executeQuery();
			while(rs.next()) {
				paymentList.add(new PaymentDTO(rs.getInt(1), rs.getDouble(2), rs.getDate(3), rs.getDate(4)));
			}
			return paymentList;
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
	
	public boolean updatePayment(PaymentDTO paymentDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.UPDATE_PAYMENT);
			ps.setDate(1, (Date)paymentDTO.getDueDate());
			ps.setInt(2, paymentDTO.getStuFeeID());
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
	
	public boolean deletePayment(PaymentDTO paymentDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.DELETE_PAYMENT);
			ps.setInt(1, paymentDTO.getStuFeeID());
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

}
