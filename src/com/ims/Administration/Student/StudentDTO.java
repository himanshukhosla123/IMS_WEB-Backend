package com.ims.Administration.Student;

import java.util.Date;

public class StudentDTO {
    private int Sid;
    private String name;
    private int age;
    private String sex;
    private int phoneNo;
    private String email;
    private String photoPath;
    private Date dob;
    private String fatherName;
    private int fatherPhNo;
    private String address;
    private Date dateOfJoin;
    private String status;

public StudentDTO() {
	
}

@Override
public String toString() {
	return "StudentDTO [Sid=" + Sid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNo=" + phoneNo
			+ ", email=" + email + ", photoPath=" + photoPath + ", dob=" + dob + ", fatherName=" + fatherName
			+ ", fatherPhNo=" + fatherPhNo + ", address=" + address + ", dateOfJoin=" + dateOfJoin + ", status="
			+ status + "]";
}

public StudentDTO(int sid, String name, int age, String sex, int phoneNo, String email, String photoPath, Date dob, String fatherName,
		int fatherPhNo, String address, Date dateOfJoin, String status) {
	
	Sid = sid;
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.phoneNo = phoneNo;
	this.email = email;
	this.photoPath = photoPath;
	this.dob = dob;
	this.fatherName = fatherName;
	this.fatherPhNo = fatherPhNo;
	this.address = address;
	this.dateOfJoin = dateOfJoin;
	this.status = status;
}

public int getSid() {
	return Sid;
}



public void setSid(int sid) {
	Sid = sid;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public String getSex() {
	return sex;
}



public void setSex(String sex) {
	this.sex = sex;
}



public int getPhoneNo() {
	return phoneNo;
}



public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public Date getDob() {
	return dob;
}



public void setDob(Date dob) {
	this.dob = dob;
}



public String getFatherName() {
	return fatherName;
}



public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}



public int getFatherPhNo() {
	return fatherPhNo;
}



public void setFatherPhNo(int fatherPhNo) {
	this.fatherPhNo = fatherPhNo;
}



public String getAddress() {
	return address;
}



public void setAddress(String address) {
	this.address = address;
}



public Date getDateOfJoin() {
	return dateOfJoin;
}



public void setDateOfJoin(Date dateOfJoin) {
	this.dateOfJoin = dateOfJoin;
}



public String getStatus() {
	return status;
}



public void setStatus(String status) {
	this.status = status;
}

public String getPhotoPath() {
	return photoPath;
}

public void setPhotoPath(String photoPath) {
	this.photoPath = photoPath;
}

}