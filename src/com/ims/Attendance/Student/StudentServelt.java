package com.ims.Attendance.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServelt
 */
@WebServlet("/student")
public class StudentServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentAttendanceDAO dao = new StudentAttendanceDAO();
		StudentAttendanceDTO dto = new StudentAttendanceDTO(420,420,new Date(),"test");
		String me = request.getParameter("method");

		try {
			switch (me) {
			case "addStudentAttendance":
				response.getWriter().println(((Boolean) dao.addStudentAttendance(dto)).toString());
				break;
			case "readStudentAttendance":
				response.getWriter().println((dao.readStudentAttendance(dto)).toString());
				break;
			case "readSpecificStudentAttendance":
				response.getWriter().println((dao.readSpecificStudentAttendance(dto)).toString());
				break;
			case "updateStudentAttendance":
				response.getWriter().println(((Boolean) dao.updateStudentAttendance(dto)).toString());
				break;
			default:response.getWriter().println("Wrong Call");
				break;
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


	
}
