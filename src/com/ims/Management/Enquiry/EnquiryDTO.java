package com.ims.Management.Enquiry;

public class EnquiryDTO {

	private String name;
	private String phnNo;
	private String email;
	private String title;
	private String desc;
	private String status;
	
	public EnquiryDTO(String name,String phnNo,String email,String title,String desc ,String status) {
	this.name=name;
	this.phnNo=phnNo;
	this.email=email;
	this.title=title;
	this.desc=desc;
	this.status=status;
	}
	
	public EnquiryDTO(String name, String phnno,String email,String desc){
		this.name=name;
		this.phnNo=phnno;
		this.desc=desc;
		this.email=email;
		this.status="pending";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EnquiryDTO [name=" + name + ", phnNo=" + phnNo + ", email=" + email + ", title=" + title + ", desc="
				+ desc + ", status=" + status + "]";
	}
	
	
	
}
