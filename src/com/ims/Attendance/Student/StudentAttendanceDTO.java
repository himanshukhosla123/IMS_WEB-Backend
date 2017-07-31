package com.ims.Attendance.Student;

import java.util.Date;

public class StudentAttendanceDTO {
	private int studentID;
	private int batchID;
	private Date date;
	private String status;

	@Override
	public String toString() {
		return "StudentAttendanceDTO [studentID=" + studentID + ", batchID=" + batchID + ", date=" + date + ", status="
				+ status + "]";
	}

	public StudentAttendanceDTO(int batchID, Date date) {
		this.batchID = batchID;
		this.date = date;
	}

	public StudentAttendanceDTO(int studentID, int batchID, Date date, String status) {
		this.studentID = studentID;
		this.batchID = batchID;
		this.date = date;
		this.status = status;
	}

	public StudentAttendanceDTO(int studentID, int batchID, Date date) {
		this.studentID = studentID;
		this.batchID = batchID;
		this.date = date;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
