package com.ims.Attendance.Student;

import java.sql.SQLException;
import java.util.Date;

public class StudentAttendanceController {
	
	
	/*
	 * will recive json and convert it into object to call functions
	 */
	public String workOnStudentAttendence(int choice) throws ClassNotFoundException, SQLException{
		StudentAttendanceDAO dao=new StudentAttendanceDAO();
		//object of dto will be created using user entered info
		//Dummy data is entered for testing
		StudentAttendanceDTO dto=new StudentAttendanceDTO(10, 100, new Date(), "Present1");
			switch(choice){
			case 1:	return dao.addStudentAttendance(dto)+"message of Student add completion";
			case 2: return dao.readStudentAttendance(dto)+"student json";
			case 3: return dao.updateStudentAttendance(dto)+"message of student updation";
			default: return "message of Invalid student Info";
			}			
	}
	}
