package com.ims.Common.CommonDAO;

public interface IPayment {
	
	final String CREATE_PAYMENT="INSERT INTO `payment`(`StuFeeId`, `Payment`, `Payment Date`, `Due Date`) VALUES (?,?,?,?);";
	final String READ_PAYMENT_ALL="SELECT * FROM `payment`;";
	final String UPDATE_PAYMENT="UPDATE `payment` SET `Due Date`=?  WHERE `StuFeeId`=?;";
	final String DELETE_PAYMENT="DELETE FROM `payment` WHERE `StuFeeId'=?;";

}
