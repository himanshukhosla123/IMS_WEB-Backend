package com.ims.Administration.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentController {
	
	StudentDAO studentDAO = new StudentDAO();
	
	public void addStudent(StudentDTO studentDTO) {
		try {
			studentDAO.addStudent(studentDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<StudentDTO> readStudent(){
	 ArrayList<StudentDTO> readList = new ArrayList<>();
	 try {
		readList = studentDAO.readStudent();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return readList;

	}
	
	public boolean deleteStudent(StudentDTO studentDTO) {
		boolean isDeleted = false;
		try {
			 isDeleted = studentDAO.deleteStudent(studentDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public boolean updateStudent(StudentDTO studentDTO) {
		boolean isUpdated = false;
		
		try {
			isUpdated = studentDAO.updateStudent(studentDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUpdated;
	}
}
