package com.ims.Attendance.Batch;

public class StuStatus implements Comparable<StuStatus>{
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
	@Override
	public String toString() {
		return "StuStatus [sId=" + sId + ", Status=" + Status + "]";
	}
	@Override
	public int compareTo(StuStatus o) {
		if(this.getsId()<o.getsId()){
			return -1;
		}
		else if(this.getsId()>o.getsId()){
			return 1;
			
		}
		return 0;
	}
}
