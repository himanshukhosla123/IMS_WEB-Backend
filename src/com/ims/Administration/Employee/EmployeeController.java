package com.ims.Administration.Employee;

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
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	
	boolean isAdded = false;
	boolean isUpdated = false;
	boolean isDeleted = false;
	
	ArrayList<EmployeeDTO> empList = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = new EmployeeDTO();
	     String param = request.getParameter("function");
	     System.out.println(param);
	     
	     switch(param) {
	     
	     case "add" : try {
				isAdded = dao.addEmployee(dto);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	               break;
	               
	     case "read" :  try {
				empList = dao.readEmployee();
				
				ObjectMapper mapper = new ObjectMapper();
				String json = mapper.writeValueAsString(empList);
				
				response.setContentType("application/json");
				response.getWriter().println(json);
				System.out.println(json);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	                break;
	                
	     case "update" : try {
				isUpdated = dao.updateEmployee(dto);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
	              break;
	              
	     case "delete" : try {
				isDeleted = dao.deleteEmployee(dto);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	               break;
	               
	     case "getList" :        
	     }
	     
	}

}
