package com.ims.Common.Utils;

public interface SqlQuery {
	/*
	 * Student Attendance Queries;
	 */
	String ADD_STUDENT_ATT = "insert into att(SID,BID,Date,Status) values(?,?,?,?);";
	String READ_STUDENT_ATT = "select SID,BID,Date,Status from att where sId=? and bId=?;";
	String READ_SPECIFIC_STUDENT_ATT = "select SID,BID,Date,Status from att where sId=? and bId=? and date=?;";
	String UPDATE_STUDENT_ATT = "update att SET status =? WHERE SID=? and BID=? and Date=?;";
	/*
	 * Student Batch Attendance Queries
	 */
	String READ_BATCH_ATT = "select SID,Status from att where bId=? and date=?;";
	/*
	 * Employee Attendance Queries
	 */
	String ADD_EMPLOYEE_ATT = "insert into empAtt(eid,Date,status) values(?,?,?);";
	String READ_EMPLOYEE_ATT = "select Date, status from empAtt where eId=?;";
	String READ_SPECIFIC_EMPLOYEE_ATT="select status from empAtt where eId=? and date=?;";
	String UPDATE_EMPLOYEE_ATT = "update empAtt SET status =? where eId= ? and Date=?;";

}
