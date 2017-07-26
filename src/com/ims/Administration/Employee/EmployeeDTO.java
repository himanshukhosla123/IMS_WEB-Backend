package com.ims.Administration.Employee;

import java.util.Date;

public class EmployeeDTO {
	private int Empid;
    private String name;
    private int age;
    private String sex;
    private int phoneNo;
    private String email;
    private String photo;
    private Date dob;
    private String fatherName;
    private int fatherPhNo;
    private String address;
    private Date dateOfJoin;
    private int salary;
    private String status;
    
    
    @Override
	public String toString() {
		return "\nEmployeeDTO\n [Empid=" + Empid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNo="
				+ phoneNo + ", email=" + email + ", photo=" + photo + ", dob=" + dob + ", fatherName=" + fatherName
				+ ", fatherPhNo=" + fatherPhNo + ", address=" + address + ", dateOfJoin=" + dateOfJoin + ", salary="
				+ salary + ", status=" + status + "]";
	}
	public EmployeeDTO(){
    	
    }
	public EmployeeDTO(int empid, String name, int age, String sex, int phoneNo, String email, String photo, Date dob,
			String fatherName, int fatherPhNo, String address, Date dateOfJoin, int salary, String status) {
		this.Empid = empid;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phoneNo = phoneNo;
		this.email = email;
		this.photo = photo;
		this.dob = dob;
		this.fatherName = fatherName;
		this.fatherPhNo = fatherPhNo;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
		this.status = status;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
