package sanujTester;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.ims.Administration.Employee.EmployeeController;
import com.ims.Administration.Employee.EmployeeDTO;

public class EmployeeTester {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			 Scanner scanner = new Scanner(System.in);
	         int empid;
	         String name;
	         String age ;
	         String sex;
	         String phone;
	         String email;
	         String photo;
	         String dob;
	         String guardianName;
	         String guardianNo;
	         String address;
	         String doj;
	         int salary;
	         String status;
	         
			
	         EmployeeController eController = new EmployeeController();
	         System.out.println("enter student id");
	 		  empid = scanner.nextInt();
	 		  System.out.println("name");
	 		  name = scanner.next();
	 		  System.out.println("age");
	 		  age = scanner.next();
	 		  System.out.println("sex");
	 		  sex = scanner.next();
	 		  System.out.println("phone");
	 		  phone = scanner.next();
	 		  System.out.println("email");
	 		  email = scanner.next();
	 		  System.out.println("photo");
	 		  photo = scanner.next();
	 		  System.out.println("dob");
	 		  dob = scanner.next();
	 		  System.out.println("father name");
	 		  guardianName = scanner.next();
	 		  System.out.println("father phone no");
	 		  guardianNo = scanner.next();
	 		  System.out.println("address");
	 		  address = scanner.next();
	 		  System.out.println("doj");
	 		  doj = scanner.next();
	 		  System.out.println("salary");
	 		  salary = scanner.nextInt();
	 		  System.out.println("status");
	 		  status = scanner.next();
	         
	         
	         EmployeeDTO employeeDTO = new EmployeeDTO(empid,name,age,sex,phone,email,photo,new Date(),
	                  guardianName,guardianNo,address,new Date(),salary,status);
	         
	         System.out.println("\nselect your choice\n1.Add\n2.Read\n3.Delete\n4.Update\n");
	         int choice = scanner.nextInt();
	         switch(choice) {
	         
	         case 1:    eController.addEmployee(employeeDTO);
	                    System.out.println("added");
	                    break;
	         case 2:    System.out.println(eController.readEmployee().toString());
	                    break;
	         case 3:     boolean isDeleted =  eController.deleteEmployee(employeeDTO);
	                        if(isDeleted == true)
	           	            System.out.println("deleted");
	                        else
	           	            System.out.println("not deleted");           
	                    break;
	         case 4:    boolean isUpdated = eController.updateEmployee(employeeDTO);
	 		                 if(isUpdated == true) {
	 			               System.out.println("Record Updated");
	 		                 }
	 		                 else
	 			               System.out.println("Can't Update");           

	         }
	         
		           
	          System.out.println(new Date());
	 		  
         scanner.close();
		}
		
	}


