package com.ims.Accounts.Expenses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.IExpense;

public class ExpenseDAO {
	
	public boolean addExpense(ExpenseDTO expenseDTO) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IExpense.CREATE_EXPENSE);
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
		ArrayList<ExpenseDTO> expenseList = new ArrayList<>();
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IExpense.READ_ALL_EXPENSE);
			rs = ps.executeQuery();
			while(rs.next()) {
				expenseList.add(new ExpenseDTO(rs.getString("Expense ID"), rs.getDate("Date"), rs.getString("Category"), 
						rs.getString("EID"), rs.getDouble("Expenditure"), rs.getString("Status")));
			}
			return expenseList;
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
	
	public ExpenseDTO readExpense(String expenseID) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ExpenseDTO expenseDTO;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IExpense.READ_EXPENSE);
			ps.setString(1, "expenseID");
			rs = ps.executeQuery();
			rs.next();
			expenseDTO = new ExpenseDTO(rs.getString("Expense ID"), rs.getDate("Date"), rs.getString("Category"), 
					rs.getString("Description"), rs.getString("EID"), rs.getDouble("Expenditure"), rs.getDouble("Advance"), 
					rs.getString("Payment Mode"), rs.getString("Cheque ID"), rs.getDouble("Balance"), rs.getString("Status"));
			return expenseDTO;
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
			ps = con.prepareStatement(IExpense.UPDATE_EXPENSE);
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
	
	public boolean deleteExpense(String expenseID) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = CommonDAO.getConnection();
			ps = con.prepareStatement(IExpense.DELETE_EXPENSE);
			ps.setString(1, expenseID);
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
