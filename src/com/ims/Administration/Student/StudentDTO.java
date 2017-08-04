package com.ims.Administration.Student;

import java.util.Date;

public class StudentDTO {
    private String Sid;
    private String name;
    private String age;
    private String sex;
    private String phoneNo;
    private String email;
    private String photoPath;
    private Date dob;
    private String guardianName;
    private String guardianPhNo;
    private String address;
    private Date dateOfJoin;
    private String status;
    private String recommEmpId;
    private int discount;

public StudentDTO() {
	
}


@Override
public String toString() {
	return "StudentDTO [Sid=" + Sid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNo=" + phoneNo
			+ ", email=" + email + ", photoPath=" + photoPath + ", dob=" + dob + ", guardianName=" + guardianName
			+ ", guardianPhNo=" + guardianPhNo + ", address=" + address + ", dateOfJoin=" + dateOfJoin + ", status="
			+ status + ", recommEmpId=" + recommEmpId + ", discount=" + discount + "]";
}




public StudentDTO(String sid, String name, String age, String sex, String phoneNo, String email, String photoPath,
		Date dob, String guardianName, String guardianPhNo, String address, Date dateOfJoin, String status,
		String recommEmpId, int discount) {
	Sid = sid;
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.phoneNo = phoneNo;
	this.email = email;
	this.photoPath = photoPath;
	this.dob = dob;
	this.guardianName = guardianName;
	this.guardianPhNo = guardianPhNo;
	this.address = address;
	this.dateOfJoin = dateOfJoin;
	this.status = status;
	this.recommEmpId = recommEmpId;
	this.discount = discount;
}


public String getSid() {
	return Sid;
}



public void setSid(String sid) {
	Sid = sid;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getAge() {
	return age;
}



public void setAge(String age) {
	this.age = age;
}



public String getSex() {
	return sex;
}



public void setSex(String sex) {
	this.sex = sex;
}



public String getPhoneNo() {
	return phoneNo;
}



public void setPhoneNo(String phoneNo) {
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



public String getGuardianName() {
	return guardianName;
}



public void setguardianName(String guardianName) {
	this.guardianName = guardianName;
}



public String getGuardianPhNo() {
	return guardianPhNo;
}



public void setguardianPhNo(String guardianPhNo) {
	this.guardianPhNo = guardianPhNo;
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

public String getRecommEmpId() {
	return recommEmpId;
}
public void setRecommEmpId(String recommEmpId) {
	this.recommEmpId = recommEmpId;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
}