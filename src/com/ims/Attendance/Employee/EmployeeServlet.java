package com.ims.Attendance.Employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		EmployeeAttendanceDTO dto = new EmployeeAttendanceDTO(420,new Date(),"test");
		String me = request.getParameter("method");

		try {
			switch (me) {
			case "addEmployeeAttendance":
				response.getWriter().println(((Boolean) dao.addEmployeeAttendance(dto)).toString());
				break;
			case "readEmployeeAttendance":
				response.getWriter().println((dao.readEmployeeAttendance(dto)).toString());
				break;
			case "readEmployeeSpecificAttendance":
				response.getWriter().println((dao.readEmployeeSpecificAttendance(dto)).toString());
				break;
			case "updateEmployeeAttendance":
				response.getWriter().println(((Boolean) dao.updateEmployeeAttendance(dto)).toString());
				break;
			default:response.getWriter().println("Wrong Call");
				break;
			}

		} catch (ClassNotFoundException | SQLException e) {
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
