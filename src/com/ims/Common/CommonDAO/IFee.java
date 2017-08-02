package com.ims.Common.CommonDAO;

public interface IFee {

	final String CREATE_FEE = "INSERT INTO `fee`(`TID`, `SID`, "
			+ "`BID`, `CID`, 'Course Amount', 'Payable Amount', 'Payment Mode', "
			+ "'Cheque Id', 'Payment Date', 'Installment Date', 'Payment', 'Balance', 'Status') "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	final String READ_ALL_FEE = "SELECT `TID`, `SID`, `CID`, 'Payable Amount', "
			+ "'Installment Date', 'Balance', 'Status' FROM `fee`;";
	final String READ_FEE = "SELECT * FROM 'fee' WHERE 'Transaction Id' = ?";
	final String UPDATE_FEE = "UPDATE `fee` SET `TID` = ?, `SID` = ?, "
			+ "`BID` = ?, `CID` = ?, 'Course Amount' = ?, 'Payable Amount' = ?, "
			+ "'Payment Mode' = ?, 'Cheque Id = ?', 'Payment Date = ?', 'Installment Date = ?', "
			+ "'Payment = ?', 'Balance = ?', 'Status = ?'  WHERE `TID` = ?;";
	final String DELETE_FEE = "DELETE FROM `fee` WHERE `TID' = ?;";

}
