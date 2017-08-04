package com.ims.Management.Courses;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


@WebServlet("/course")
public class CourseController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request,response);
//		response.sendRedirect("error.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodName=(String)request.getParameter("method");
		String dtoObj=request.getParameter("dto_obj");
		System.out.println(dtoObj);
		System.out.println(methodName);
		CourseDAO courseDAO=new CourseDAO();
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		String json;
		CourseDTO courseDTO;
		
		try{
		switch(methodName){
		case "getuserlist":
			ArrayList<CourseDTO> courseList=courseDAO.readCourseList();
			json=mapper.writeValueAsString(courseList);
			response.getWriter().println(json);
            break;
		case "add":
			courseDTO=mapper.readValue(dtoObj,new TypeReference<CourseDTO>(){});
			System.out.println(courseDTO);
			courseDTO=courseDAO.addCourse(courseDTO);
			json=mapper.writeValueAsString(courseDTO);
			response.getWriter().println(json);
			break;
		case "update":
			courseDTO=mapper.readValue(dtoObj,new TypeReference<CourseDTO>(){});
			courseDTO=courseDAO.updateCourse(courseDTO);
			json=mapper.writeValueAsString(courseDTO);
			response.getWriter().println(json);
			break;
		case "delete":
			courseDTO=mapper.readValue(dtoObj,new TypeReference<CourseDTO>(){});
			courseDTO=courseDAO.deleteCourse(courseDTO);
			json=mapper.writeValueAsString(courseDTO);
			response.getWriter().println(json);
			break;
		case "read":
			courseDTO=mapper.readValue(dtoObj,new TypeReference<CourseDTO>(){});
			courseDTO=courseDAO.readCourse(courseDTO);
			json=mapper.writeValueAsString(courseDTO);
			response.getWriter().println(json);
			break;
			
            
		};
		} catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		 
		 
		
	}

}
