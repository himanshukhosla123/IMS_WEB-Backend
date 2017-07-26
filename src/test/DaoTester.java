package test;

import java.util.Date;
import java.util.TreeSet;

import com.ims.Attendance.Batch.BatchAttendanceDAO;
import com.ims.Attendance.Batch.BatchAttendanceDTO;
import com.ims.Attendance.Batch.StuStatus;

public class DaoTester {

	public static void main(String[] args) throws Exception {
		//EmployeeAttendanceDAO e=new EmployeeAttendanceDAO();
		//StudentAttendanceDAO a=new StudentAttendanceDAO();
		BatchAttendanceDAO b=new BatchAttendanceDAO();
		TreeSet<StuStatus>ab=new TreeSet<>();
		ab.add(new StuStatus(10, "a"));
		ab.add(new StuStatus(11, "ab"));
		ab.add(new StuStatus(13, "ac"));
		ab.add(new StuStatus(14, "as"));
		System.out.println(b.readAtt(new BatchAttendanceDTO(4, new Date(),ab)));
	}

}
