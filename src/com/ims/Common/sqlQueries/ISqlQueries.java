package com.ims.Common.sqlQueries;

public interface ISqlQueries {
    
	String ADD_STUDENT = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?);";
	String READ_STUDENT = "select * from student";
	String UPDATE_STUDENT = "update student set Name=? Age=? Sex=? PhoneNo=? Email=? DOB=? Father name=? father phone number=?"
			                   +"address=? Date of joining=? status=?,where SID=?";
	
	String ADD_EMPLOYEE = "insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			                
	String READ_EMPLOYEE = "select * from employee";
	String UPDATE_EMPLOYEE = "update student set Name=? Age=? Sex=? PhoneNo=? Email=? DOB=? Father name=? father phone number=?"
			                   +"address=? Date of joining=? status=?,where EMPID=?";
}
