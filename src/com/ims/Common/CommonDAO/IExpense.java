package com.ims.Common.CommonDAO;

public interface IExpense {

	final String CREATE_EXPENSE = "INSERT INTO `expense`(`EXPENSEID`, 'Date', 'Category', "
			+ "'Description', 'EMPID', 'Expenditure', 'Advance' `PaymentMode`, "
			+ "'Cheque Id', `Balance`, 'Status') VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	final String READ_ALL_EXPENSE = "SELECT 'EXPENSEID', 'Date', 'Category', 'EMPID', "
			+ "'Expenditure', 'Status' FROM `expense`;";
	final String READ_EXPENSE = "SELECT * FROM 'expense' WHERE 'EXPENSEID' = ?";
	final String UPDATE_EXPENSE = "UPDATE `expense` SET `EXPENSEID` = ?, 'Date' = ?, 'Category' = ?, "
			+ "'Description = ?', 'EMPID = ?', 'Expenditure = ?', 'Advance = ?', `PaymentMode` = ?, "
			+ "'Cheque Id = ?', `Balance = ?`, 'Status' = ? WHERE `EXPENSEID` = ? ;";
	final String DELETE_EXPENSE = "DELETE FROM `expense` WHERE `EXPENSEID' = ? ;";

}
