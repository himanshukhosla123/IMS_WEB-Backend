package com.ims.Accounts.FeeManagement;

public class FeeDTO {
	
	private int studentId;
	private int courseId;
	private int stuFeeId;
	private String status;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getStuFeeID() {
		return stuFeeId;
	}
	public void setStuFeeID(int stuFeeId) {
		this.stuFeeId = stuFeeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FeeDTO [studentId=" + studentId + ", courseId=" + courseId + ", stuFeeId=" + stuFeeId + ", status="
				+ status + "]";
	}
	public FeeDTO(int studentId, int courseId, int stuFeeId, String status) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.stuFeeId = stuFeeId;
		this.status = status;
	}

}
