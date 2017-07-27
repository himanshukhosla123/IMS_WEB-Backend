package com.ims.Attendance.Employee;

import java.sql.SQLException;
import java.util.Date;

public class EmployeeAttendanceController {
	public String workOnEmployeeAttendence(int choice) throws ClassNotFoundException, SQLException{
		EmployeeAttendanceDAO dao=new EmployeeAttendanceDAO();
		//object of dto will be created using user entered info
		//Dummy data is entered for testing
		EmployeeAttendanceDTO dto=new EmployeeAttendanceDTO(101,new Date(), "Present1");
			switch(choice){
			case 1:	return dao.addEmployeeAttendance(dto)+"message of employee addition";
			case 2: return dao.readEmployeeAttendance(dto)+"employee json";
			case 3: return dao.updateEmployeeAttendance(dto)+"message of employee updation";
			default: return "message of Invalid Employee Info";
			}			
	}
	

}
