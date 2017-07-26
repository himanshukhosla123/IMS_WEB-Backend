package com.ims.Management.Courses;

import java.sql.SQLException;
import java.util.ArrayList;

public class CourseController {

	public boolean addCourse(CourseDTO courseDTO) {
		CourseDAO courseDAO=new CourseDAO();
		try {
			return courseDAO.addCourse(courseDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean updateCourse(CourseDTO courseDTO) {
		CourseDAO courseDAO=new CourseDAO();
		try {
			return courseDAO.updateCourse(courseDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList<CourseDTO> readCourse(CourseDTO courseDTO) {
		CourseDAO courseDAO=new CourseDAO();
		try {
			return courseDAO.readCourse(courseDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean deleteCourse(CourseDTO courseDTO) {
		CourseDAO courseDAO=new CourseDAO();
		try {
			return courseDAO.deleteCourse(courseDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	

}
