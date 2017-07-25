package test;

import java.sql.SQLException;
import java.util.Date;

import com.ims.Attendance.Employee.EmployeeAttendanceDAO;
import com.ims.Attendance.Employee.EmployeeAttendanceDTO;

public class DaoTester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeAttendanceDAO e=new EmployeeAttendanceDAO();
		System.out.println(e.updDto(new EmployeeAttendanceDTO(5, new Date(),"ASD")));
	}

}
