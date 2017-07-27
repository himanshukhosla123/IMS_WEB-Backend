package com.ims.Common.CommonDAO;

public interface IFee {
	
	final String CREATE_FEE="INSERT INTO `fee`(`Student Id`, `Course Id`, `StuFeeId`, `Status`) VALUES (?,?,?,?);";
	final String READ_FEE_ALL="SELECT * FROM `fee`;";
	final String UPDATE_FEE="UPDATE `fee` SET `Course Id`=?, `Status`=?  WHERE `StuFeeId`=?;";
	final String DELETE_FEE="DELETE FROM `fee` WHERE `StuFeeId'=?;";
	final String IF_FEE_PAID = "";

}
