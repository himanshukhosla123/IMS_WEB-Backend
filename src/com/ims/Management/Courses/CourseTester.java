package com.ims.Management.Courses;

import java.util.ArrayList;

public class CourseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CourseDTO courseDTO=new CourseDTO("1125","himanshu",1221,"html css js","2 months");
       CourseController courseController=new CourseController();
       System.out.println(courseController.addCourse(courseDTO));
       courseDTO.setName("hk");
       System.out.println(courseController.updateCourse(courseDTO));
       ArrayList<CourseDTO> list=courseController.readCourse(courseDTO);
	    for(CourseDTO a:list) {
	    	System.out.println(a.toString());
	    }
//	    System.out.println(courseController.deleteCourse(courseDTO));
	    	
	
	}

}
