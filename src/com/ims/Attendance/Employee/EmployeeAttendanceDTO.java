package com.ims.Attendance.Employee;

import java.util.Date;

public class EmployeeAttendanceDTO {
	private int eId;
	private Date date;
	private String status;
	
	@Override
	public String toString() {
		return "EmployeeAttendanceDTO [eId=" + eId + ", date=" + date + ", status=" + status + "]";
	}

	public EmployeeAttendanceDTO(int eId, Date date, String status) {
		this.eId = eId;
		this.date = date;
		this.status = status;
	}

	public EmployeeAttendanceDTO(int eId, Date date) {
		this.eId = eId;
		this.date = date;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
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
