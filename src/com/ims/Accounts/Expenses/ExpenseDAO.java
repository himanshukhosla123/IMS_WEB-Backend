package com.ims.Accounts.Expenses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.IPayment;

public class ExpenseDAO {
	
	public boolean addExpense(ExpenseDTO expenseDTO) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.CREATE_PAYMENT);
			ps.setString(1, expenseDTO.getExpenseID());
			ps.setDate(2, (java.sql.Date) expenseDTO.getDate());
			ps.setString(3, expenseDTO.getCategory());
			ps.setString(4, expenseDTO.getDescription());
			ps.setString(5, expenseDTO.getEID());
			ps.setDouble(6, expenseDTO.getExpenditure());
			ps.setDouble(7, expenseDTO.getAdvance());
			ps.setString(8, expenseDTO.getPaymentMode());
			ps.setString(9, expenseDTO.getChequeID());
			ps.setDouble(10, expenseDTO.getBalance());
			ps.setString(11, expenseDTO.getStatus());
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
	
	public ArrayList<ExpenseDTO> readAllExpense() throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<ExpenseDTO> paymentList = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.READ_PAYMENT_ALL);
			rs = ps.executeQuery();
			while(rs.next()) {
				paymentList.add(new ExpenseDTO(rs.getString("Expense ID"), rs.getDate("Date"), rs.getString("Category"), 
						rs.getString("EID"), rs.getDouble("Expenditure"), rs.getString("Status")));
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
	
	public ArrayList<ExpenseDTO> readExpense() throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<ExpenseDTO> paymentList = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.READ_PAYMENT_ALL);
			rs = ps.executeQuery();
			while(rs.next()) {
				paymentList.add(new ExpenseDTO(rs.getString("Expense ID"), rs.getDate("Date"), rs.getString("Category"), 
						rs.getString("Description"), rs.getString("EID"), rs.getDouble("Expenditure"), rs.getDouble("Advance"), 
						rs.getString("Payment Mode"), rs.getString("Cheque ID"), rs.getDouble("Balance"), rs.getString("Status")));
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
	
	public boolean updateExpense(ExpenseDTO expenseDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.UPDATE_PAYMENT);
			ps.setString(1, expenseDTO.getExpenseID());
			ps.setDate(2, (java.sql.Date) expenseDTO.getDate());
			ps.setString(3, expenseDTO.getCategory());
			ps.setString(4, expenseDTO.getDescription());
			ps.setString(5, expenseDTO.getEID());
			ps.setDouble(6, expenseDTO.getExpenditure());
			ps.setDouble(7, expenseDTO.getAdvance());
			ps.setString(8, expenseDTO.getPaymentMode());
			ps.setString(9, expenseDTO.getChequeID());
			ps.setDouble(10, expenseDTO.getBalance());
			ps.setString(11, expenseDTO.getStatus());
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
	
	public boolean deleteExpense(int expenseID) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IPayment.DELETE_PAYMENT);
			ps.setInt(1, expenseID);
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
