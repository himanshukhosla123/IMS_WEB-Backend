package com.ims.Attendance.Student;

import java.util.Date;

public class StudentAttendanceDTO {
	private int sId;
	private int bId;
	private Date date;
	private String status;

	@Override
	public String toString() {
		return "AttDto [sId=" + sId + ", bId=" + bId + ", date=" + date + ", status=" + status + "]";
	}
	
	public int getsId() {
		return sId;
	}

	public StudentAttendanceDTO(int bId, Date date) {
		this.bId = bId;
		this.date = date;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
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

	public StudentAttendanceDTO(int sId, int bId, Date date, String status) {
		this.sId = sId;
		this.bId = bId;
		this.date = date;
		this.status = status;
	}

	public StudentAttendanceDTO(int sId, int bId, Date date) {
		this.sId = sId;
		this.bId = bId;
		this.date = date;
	}

}
