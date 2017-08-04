package com.ims.Attendance.Employee;

import java.util.Date;

public class EmployeeAttendanceDTO {
	@Override
	public String toString() {
		return "EmployeeAttendanceDTO [employeeID=" + employeeID + ", date=" + date + ", status=" + status + "]";
	}

	private int employeeID;
	private Date date;
	private String status;
	
	public EmployeeAttendanceDTO(int employeeID, Date date, String status) {
		this.employeeID = employeeID;
		this.date = date;
		this.status = status;
	}

	public EmployeeAttendanceDTO(int employeeID, Date date) {
		this.employeeID=employeeID;
		this.date = date;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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
