package test;

import com.ims.Attendance.Batch.BatchAttendanceController;
import com.ims.Attendance.Employee.EmployeeAttendanceController;
import com.ims.Attendance.Student.StudentAttendanceController;

public class DaoTester {

	public static void main(String[] args) throws Exception {
		//EmployeeAttendanceDAO e=new EmployeeAttendanceDAO();
		//StudentAttendanceDAO a=new StudentAttendanceDAO();
		System.out.println(new StudentAttendanceController().workOnStudentAttendence(1));
		System.out.println(new StudentAttendanceController().workOnStudentAttendence(2));
		System.out.println(new StudentAttendanceController().workOnStudentAttendence(3));
		System.out.println(new StudentAttendanceController().workOnStudentAttendence(4));
		System.out.println(new EmployeeAttendanceController().workOnEmployeeAttendence(1));
		System.out.println(new EmployeeAttendanceController().workOnEmployeeAttendence(2));
		System.out.println(new EmployeeAttendanceController().workOnEmployeeAttendence(3));
		System.out.println(new EmployeeAttendanceController().workOnEmployeeAttendence(4));
		System.out.println(new BatchAttendanceController().workOnBatchAttendence(1));
		System.out.println(new BatchAttendanceController().workOnBatchAttendence(2));
		System.out.println(new BatchAttendanceController().workOnBatchAttendence(3));
		

	
	}

}
