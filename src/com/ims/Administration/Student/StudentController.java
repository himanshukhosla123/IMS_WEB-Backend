package com.ims.Administration.Student;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class StudentController {
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
          String status;
          
          StudentDAO studentDAO = new StudentDAO();
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
  		  System.out.println("status");
  		  status = scanner.next();
  		  
  		  StudentDTO studentDTO = new StudentDTO(sid,name,age,sex,phone,email,photo,new Date(),fathername,fatherno,address,new Date(),status);
  		   studentDAO.addStudent(studentDTO);
//             System.out.println(studentDAO.readStudent().toString());
               
           System.out.println("added");
           System.out.println(new Date());
           scanner.close();
  		  
}
}
