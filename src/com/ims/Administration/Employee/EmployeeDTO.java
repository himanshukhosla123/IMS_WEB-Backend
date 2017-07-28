package com.ims.Administration.Employee;

import java.util.Date;

public class EmployeeDTO {
	private int Empid;
    private String name;
    private String age;
    private String sex;
    private String phoneNo;
    private String email;
    private String photo;
    private Date dob;
    private String guardianName;
    private String guardianPhNo;
    private String address;
    private Date dateOfJoin;
    private int salary;
    private String status;
    
    
    public EmployeeDTO() {
    	
    }
    
    
    public EmployeeDTO(int empid, String name, String age, String sex, String phoneNo, String email, String photo,
			Date dob, String guardianName, String guardianPhNo, String address, Date dateOfJoin, int salary,
			String status) {
		Empid = empid;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phoneNo = phoneNo;
		this.email = email;
		this.photo = photo;
		this.dob = dob;
		this.guardianName = guardianName;
		this.guardianPhNo = guardianPhNo;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
		this.status = status;
		
	}
    
     

	@Override
	public String toString() {
		return "EmployeeDTO [Empid=" + Empid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNo="
				+ phoneNo + ", email=" + email + ", photo=" + photo + ", dob=" + dob + ", guardianName=" + guardianName
				+ ", guardianPhNo=" + guardianPhNo + ", address=" + address + ", dateOfJoin=" + dateOfJoin + ", salary="
				+ salary + ", status=" + status + "]";
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
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianPhNo() {
		return guardianPhNo;
	}
	public void setGuardianPhNo(String guardianPhNo) {
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
