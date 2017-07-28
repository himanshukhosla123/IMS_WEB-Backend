package sanujTester;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.ims.Administration.Student.StudentController;
import com.ims.Administration.Student.StudentDTO;

public class StudentTester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
         int sid;
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
         String status;
         String recommEmpId;
         int discount;
		
         StudentController sController = new StudentController();
         System.out.println("enter student id");
 		  sid = scanner.nextInt();
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
 		  System.out.println("status");
 		  status = scanner.next();
         System.out.println("Recommended by employee");
         recommEmpId = scanner.next();
         System.out.println("Discount");
         discount = scanner.nextInt();
         
         StudentDTO studentDTO = new StudentDTO(sid,name,age,sex,phone,email,photo,new Date(),
                  guardianName,guardianNo,address,new Date(),status,recommEmpId,discount);
         
         System.out.println("\nselect your choice\n1.Add\n2.Read\n3.Delete\n4.Update\n");
         int choice = scanner.nextInt();
         switch(choice) {
         
         case 1:    sController.addStudent(studentDTO);
                    System.out.println("added");
                    break;
         case 2:    System.out.println(sController.readStudent().toString());
                    break;
         case 3:     boolean isDeleted =  sController.deleteStudent(studentDTO);
                        if(isDeleted == true)
           	            System.out.println("deleted");
                        else
           	            System.out.println("not deleted");           
                    break;
         case 4:    boolean isUpdated = sController.updateStudent(studentDTO);
 		                 if(isUpdated == true) {
 			               System.out.println("Record Updated");
 		                 }
 		                 else
 			               System.out.println("Can't Update");           

         }
         
	           
          System.out.println(new Date());
 		  

	}

}
