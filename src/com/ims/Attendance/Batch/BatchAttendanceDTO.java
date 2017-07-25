package com.ims.Attendance.Batch;

import java.util.Date;
import java.util.TreeSet;

public class BatchAttendanceDTO {
	
	private int bId;
	private Date date;
	private TreeSet<StuStatus> stattSet;

	@Override
	public String toString() {
		return "BatchAttendanceDTO [bId=" + bId + ", date=" + date + ", stattSet=" + stattSet + "]";
	}
	 
	public StuStatus createStuStatus(int sId ,String status){
		return new StuStatus(sId,status);
	}

	public BatchAttendanceDTO(int bId, Date date) {
		this.bId = bId;
		this.date = date;
		this.stattSet= new TreeSet<>();
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

	public BatchAttendanceDTO(int bId, Date date, TreeSet<StuStatus> stattSet) {
		this.bId = bId;
		this.date = date;
		this.stattSet = stattSet;
	}

	public TreeSet<StuStatus> getStattSet() {
		return stattSet;
	}

	public void setStattMap(TreeSet<StuStatus> stattSet) {
		this.stattSet = stattSet;
	}

	
}
