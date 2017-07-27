package com.ims.Accounts.FeeManagement;

public class FeeDTO {
	
	private int studentId;
	private int courseId;
	private int stuPaymentId;
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
	public int getPaymentID() {
		return stuPaymentId;
	}
	public void setPaymentID(int stuPaymentId) {
		this.stuPaymentId = stuPaymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FeeDTO [studentId=" + studentId + ", courseId=" + courseId + ", paymentId=" + stuPaymentId + ", status="
				+ status + "]";
	}

}
