package com.ims.Management.Courses;

public class CourseDTO {

	private String CourseId;
	private String name;
	private int fee;
	private String desc;
	private String appDuration;
	
	public CourseDTO(String CourseId,String name,int fee,String desc,String appDuration) {
		this.CourseId=CourseId;
		this.name=name;
		this.fee=fee;
		this.desc=desc;
		this.appDuration=appDuration;
	}

	
	public CourseDTO(String courseId, String name, int fee, String appDuration) {
		super();
		this.CourseId = courseId;
		this.name = name;
		this.fee = fee;
		this.appDuration = appDuration;
	}
   
	public CourseDTO() {}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAppDuration() {
		return appDuration;
	}

	public void setAppDuration(String appDuration) {
		this.appDuration = appDuration;
	}

	@Override
	public String toString() {
		return "CourseDTO [CourseId=" + CourseId + ", name=" + name + ", fee=" + fee + ", desc=" + desc
				+ ", appDuration=" + appDuration + "]";
	}
	
	
}
