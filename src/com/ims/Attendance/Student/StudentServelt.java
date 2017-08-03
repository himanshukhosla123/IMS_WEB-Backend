package com.ims.Attendance.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class StudentServelt
 */
@WebServlet("/student")
public class StudentServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @return 
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentAttendanceDAO dao = new StudentAttendanceDAO();
		StudentAttendanceDTO dto = new StudentAttendanceDTO(4321,4310,new Date(),"test2");
		String me = request.getParameter("method");
/*RequestDispatcher rs=request.getRequestDispatcher("/index.html");
*/		try {
			switch (me) {
			case "addStudentAttendance":
				response.getWriter().println(new Gson().toJson(dao.addStudentAttendance(dto)));
				break;
			case "readStudentAttendance":
				response.getWriter().println(new Gson().toJson(dao.readStudentAttendance(dto)));
				break;
			case "readSpecificStudentAttendance":
				response.getWriter().println(new Gson().toJson(dao.readSpecificStudentAttendance(dto)));
				break;
			case "updateStudentAttendance":
				response.getWriter().println(new Gson().toJson(dao.updateStudentAttendance(dto)));
				break;
			default:response.getWriter().println(new Gson().toJson("Wrong Call"));
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
