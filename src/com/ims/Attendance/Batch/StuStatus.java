package com.ims.Attendance.Batch;

public class StuStatus {
	private int sId;
	private String Status;
	public int getsId() {
		return sId;
	}
	public String getStatus() {
		return Status;
	}
	public StuStatus(int sId, String status) {
		this.sId = sId;
		Status = status;
	}
}
