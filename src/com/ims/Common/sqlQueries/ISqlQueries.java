package com.ims.Common.sqlQueries;

public interface ISqlQueries {
    
	String ADD_STUDENT = "insert into student(`SID`, `Name`, `Age`, `Sex`, `Phone number`, `Email`, `Photo path`, `DOB`,"
			+ "`Guardian name`, `Guardian phone number`, `Address`, `Date of joining`, `Status`, `Recomm EmpId`, `Discount`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
	
	String READ_STUDENT = "select * from student;";
	
	String READ_STUDENT_TABLE = "select student.SID, student.name, 'student.Phone number', 'course.Course name',"
			+ "batch.BATCHID from(((student INNER JOIN student_batch ON student.SID=student_batch.SID)"
			+ "INNER JOIN batch ON student_batch.BID=batch.BATCHID)INNER JOIN course ON batch.COURSEID=course.COURSEID); ";
	
	String UPDATE_STUDENT = "update student set Name=? Age=? Sex=? PhoneNo=? Email=? DOB=? Guardian name=? Guardian phone number=?"
			                   +"Address=? Date of joining=? Status=? Recomm EmpId=? Discount=?,where SID=?;";
	
	String DELETE_STUDENT = "delete from student where SID=?;";
	
	String ADD_EMPLOYEE = "insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			                
	String READ_EMPLOYEE = "select * from employee;";
	
	String READ_EMPLOYEE_TABLE = "select EMPID, Name, 'Phone number', 'Date of joining', status from employee";
	
	String UPDATE_EMPLOYEE = "update student set Name=? Age=? Sex=? PhoneNo=? Email=? DOB=? Father name=? father phone number=?"
			                   +"address=? Date of joining=? status=?,where EMPID=?;";
	
	String DELETE_EMPLOYEE =  "delete from employee where EMPID=?;";	
}
