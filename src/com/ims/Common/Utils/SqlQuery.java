package com.ims.Common.Utils;

public interface SqlQuery {
	String READ_BATCH_ATT="select * from att where bId=? and date=?;"; 
	String ADD_STUDENT_ATT="insert into att values(?,?,?,?);";
	String READ_STUDENT_ATT="select * from att where sId=? and bId=?;";
	String UPDATE_STUDENT_ATT="update att SET status ='?' WHERE SID=? and BID=? and Date=?;";
	String ADD_EMPLOYEE_ATT="insert into empAtt values(?,?,?);";
	String READ_EMPLOYEE_ATT="select * from empAtt where eId=?;";
	String UPDATE_EMPLOYEE_ATT="update empAtt SET status ='?' where bId=? and Date=?;";

}
