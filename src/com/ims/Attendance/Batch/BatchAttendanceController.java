package com.ims.Attendance.Batch;

import java.sql.SQLException;
import java.util.Date;
import java.util.TreeSet;

public class BatchAttendanceController {public String workOnBatchAttendence(int choice) throws ClassNotFoundException, SQLException{
		BatchAttendanceDAO dao=new BatchAttendanceDAO();
		//object of dto will be created using user entered info
		//Dummy data is entered for testing
		TreeSet<StudentStatus> ts=new TreeSet<>();
		ts.add(new StudentStatus(10,"PP"));
		ts.add(new StudentStatus(101,"PP"));
		ts.add(new StudentStatus(1010,"PP"));
		BatchAttendanceDTO dto=new BatchAttendanceDTO(101,new Date(),ts );
			switch(choice){
			case 1:	return dao.addBatchAttendance(dto)+" message of batch addition";
			case 2: return dao.readBatchAttendance(dto)+" batch json";
			default: return "message of Invalid batch Info";
			}			
	}
	

}
