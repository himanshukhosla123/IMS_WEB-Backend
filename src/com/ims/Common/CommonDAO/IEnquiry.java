package com.ims.Common.CommonDAO;

public interface IEnquiry {

	String ADDENQUIRY="INSERT INTO `enquiry`(`Name`, `Phone number`, `Email`, `enquiry title`, `enquiry desc`, `status`) VALUES (?,?,?,?,?,?);";
	String UPDATEENQUIRY="UPDATE `enquiry` SET `Name`=?,`Email`=?,`enquiry title`=?,`enquiry desc`=?,`status`=? WHERE `Phone number`=?;";
	String DELETEENQUIRY="DELETE FROM `enquiry` WHERE `Phone number`=?;";
	String SELECTENQUIRY="SELECT * FROM `enquiry` WHERE 1;";
	
}
