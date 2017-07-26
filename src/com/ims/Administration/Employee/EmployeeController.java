package com.ims.Administration.Employee;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;



public class EmployeeController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        int sid;
        String name;
        int age ;
        String sex;
        int phone;
        String email;
        String photo;
        String dob;
        String fathername;
        int fatherno;
        String address;
        String doj;
        int salary;
        String status;
        
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println("enter student id");
		  sid = scanner.nextInt();
		  System.out.println("name");
		  name = scanner.next();
		  System.out.println("age");
		  age = scanner.nextInt();
		  System.out.println("sex");
		  sex = scanner.next();
		  System.out.println("phone");
		  phone = scanner.nextInt();
		  System.out.println("email");
		  email = scanner.next();
		  System.out.println("photo");
		  photo = scanner.next();
		  System.out.println("dob");
		  dob = scanner.next();
		  System.out.println("father name");
		  fathername = scanner.next();
		  System.out.println("father phone no");
		  fatherno = scanner.nextInt();
		  System.out.println("address");
		  address = scanner.next();
		  System.out.println("doj");
		  doj = scanner.next();
          System.out.println("salary");
          salary = scanner.nextInt();
		  System.out.println("status");
		  status = scanner.next();
		  
		  EmployeeDTO employeeDTO = new EmployeeDTO(sid,name,age,sex,phone,email,photo,new Date(),fathername,fatherno,address,new Date(),salary,status);
		   employeeDAO.addEmployee(employeeDTO);
//           System.out.println(employeeDAO.readEmployee().toString());
             
         System.out.println("added");
         System.out.println(new Date());
		  
}  
	
}
