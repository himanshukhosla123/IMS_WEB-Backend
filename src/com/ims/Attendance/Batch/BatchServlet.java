package com.ims.Attendance.Batch;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BatchServlet
 */
@WebServlet("/batch")
public class BatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BatchAttendanceDAO dao = new BatchAttendanceDAO();
		TreeSet<StudentStatus> ade=new TreeSet<>();
		ade.add(new StudentStatus(1212,	"yes go"));
		ade.add(new StudentStatus(112,	"yes just go"));
BatchAttendanceDTO dto = new BatchAttendanceDTO(420,new Date(),ade);
		String me = request.getParameter("method");

		try {
			switch (me) {
			case "addBatchAttendance":
				response.getWriter().println(((Integer) dao.addBatchAttendance(dto)).toString());
				break;
			case "readBatchAttendance":
				response.getWriter().println((dao.readBatchAttendance(dto)).toString());
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
