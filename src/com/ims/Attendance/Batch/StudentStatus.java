package com.ims.Attendance.Batch;

public class StudentStatus implements Comparable<StudentStatus>{
	private int studentID;
	private String status;
	
	public StudentStatus(int studentID, String status) {
		this.studentID = studentID;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "StudentStatus [studentID=" + studentID + ", status=" + status + "]";
	}

	
	
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int compareTo(StudentStatus o) {
		if(this.getStudentID()<o.getStudentID()){
			return -1;
		}
		else if(this.getStudentID()>o.getStudentID()){
			return 1;
			
		}
		return 0;
	}
}
