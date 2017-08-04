package com.ims.Attendance.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.ims.Common.Utils.CustomDateFormat;

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
		ObjectMapper map = new ObjectMapper();
		String method = request.getParameter("method");
		String json = request.getParameter("dto");
		StudentAttendanceDTO dto;

		/*
		 * RequestDispatcher rs=request.getRequestDispatcher("/index.html");
		 */ try {
			switch (method) {
			case "addStudentAttendance":
				dto = (StudentAttendanceDTO) map.readValue(json, new TypeReference<StudentAttendanceDTO>() {
				});
				response.getWriter().println(map.writeValueAsString(dao.addStudentAttendance(dto)));
				break;
			case "readStudentAttendance":
				response.getWriter().println(map.writeValueAsString(dao.readStudentAttendance()));
				break;
			case "readSpecificStudentAttendance":
				dto = new StudentAttendanceDTO(4310, 4321, CustomDateFormat.getDate("20/01/2016"), "test2");
				response.getWriter().println(map.writeValueAsString(dao.readSpecificStudentAttendance(dto)));
				break;
			case "updateStudentAttendance":
				dto = (StudentAttendanceDTO) map.readValue(json, new TypeReference<StudentAttendanceDTO>() {
				});
				response.getWriter().println(map.writeValueAsString(dao.updateStudentAttendance(dto)));
				break;

			case "deleteStudentAttendance":
				dto = (StudentAttendanceDTO) map.readValue(json, new TypeReference<StudentAttendanceDTO>() {
				});
				response.getWriter().println(map.writeValueAsString(dao.deleteStudentAttendance(dto)));

				break;
			default:
					response.getWriter().println(map.writeValueAsString("Wrong Call"));
				break;
			}

		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
