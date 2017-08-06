package com.ims.Attendance.Employee;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.ims.Common.Utils.CustomDateFormat;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeAttendanceDAO dao = new EmployeeAttendanceDAO();
		String me = request.getParameter("method");
		ObjectMapper map=new ObjectMapper();
		try {
			EmployeeAttendanceDTO dto = new EmployeeAttendanceDTO(420, CustomDateFormat.getDate("20/01/2016"),"test");
			switch (me) {
			
			case "addEmployeeAttendance":
				response.getWriter().println(map.writeValueAsString( dao.addEmployeeAttendance(dto)));
				break;
			case "readEmployeeAttendance":
				response.getWriter().println(map.writeValueAsString(dao.readEmployeeAttendance()));
				break;
			case "readEmployeeSpecificAttendance":
				response.getWriter().println(map.writeValueAsString(dao.readEmployeeSpecificAttendance(dto)));
				break;
			case "updateEmployeeAttendance":
				response.getWriter().println(map.writeValueAsString(dao.updateEmployeeAttendance(dto)));
				break;
			default:response.getWriter().println("Wrong Call");
				break;
			}

		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
