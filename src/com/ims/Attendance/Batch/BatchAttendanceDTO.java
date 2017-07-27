package com.ims.Attendance.Batch;

import java.util.Date;
import java.util.TreeSet;

public class BatchAttendanceDTO {
	
	private int batchID;
	private Date date;
	private TreeSet<StudentStatus> studentStatusSet;

	@Override
	public String toString() {
		return "BatchAttendanceDTO [batchID=" + batchID + ", date=" + date + ", studentStatusSet=" + studentStatusSet
				+ "]";
	}

	public StudentStatus createStuStatus(int studentID ,String status){
		return new StudentStatus(studentID,status);
	}

	public BatchAttendanceDTO(int batchID, Date date) {
		this.batchID = batchID;
		this.date = date;
		this.studentStatusSet= new TreeSet<>();
	}

	public BatchAttendanceDTO(int batchID, Date date, TreeSet<StudentStatus> studentStatusSet) {
		this.batchID = batchID;
		this.date = date;
		this.studentStatusSet = studentStatusSet;
	}

	public int getBatchID() {
		return batchID;
	}

	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TreeSet<StudentStatus> getStudentStatusSet() {
		return studentStatusSet;
	}

	public void setStudentStatusSet(TreeSet<StudentStatus> studentStatusSet) {
		this.studentStatusSet = studentStatusSet;
	}

	
}
