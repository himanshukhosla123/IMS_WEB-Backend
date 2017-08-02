package com.ims.Administration.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Servlet implementation class StudentServletController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	
	boolean isAdded = false;
	boolean isUpdated = false;
	boolean isDeleted = false;
	
	ArrayList<StudentDTO> studentList = new ArrayList<>();
	
   
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDAO dao = new StudentDAO();
		StudentDTO dto  = new StudentDTO();
		System.out.println(request);
		
		String requestParam = (String)request.getParameter("function");
		System.out.println(requestParam);
		switch(requestParam) {
		 
		case "add" : try {
				 isAdded = dao.addStudent(dto);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		            System.out.println(isAdded);
		            break;
		            
		case "read" :   try {
				studentList = dao.readStudent();
				ObjectMapper mapper = new ObjectMapper();
				String json = mapper.writeValueAsString(studentList);
				//System.out.println(json);
				response.setContentType("application/json");
				response.getWriter().println(json);
								
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		             break;
		
		
		case "update" :  try {
			       
			isUpdated = dao.updateStudent(dto);
					
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}  
		        break;
 		     
		case "delete" :   try {
			
			isDeleted = dao.deleteStudent(dto);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		     break;
		     
		case "getStudentList" :  try {
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		
	}

}
