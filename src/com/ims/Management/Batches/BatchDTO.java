package com.ims.Management.Batches;

public class BatchDTO {

	private String batchId;
	private int noOfStudent;
	private String courseId;
	private String timing;
	private String classDays;
	private String classMode;
	
	public BatchDTO(String batchId,int noOfStudent,String courseId, String timing,String classDays,String classMode) 
	{
		this.batchId=batchId;
		this.noOfStudent=noOfStudent;
		this.courseId=courseId;
		this.timing=timing;
		this.classDays=classDays;
		this.classMode=classMode;
	}
	
	public BatchDTO(String batchId,int noOfStudent,String courseId, String timing) 
	{
		this.batchId=batchId;
		this.noOfStudent=noOfStudent;
		this.courseId=courseId;
		this.timing=timing;
		this.classDays="weekdays";
		this.classMode="offline";
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getClassDays() {
		return classDays;
	}

	public void setClassDays(String classDays) {
		this.classDays = classDays;
	}

	public String getClassMode() {
		return classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
	}
	 
	
}
