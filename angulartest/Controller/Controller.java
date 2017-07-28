package com.mvc.Controller;


     
	import java.io.IOException;
	import java.sql.SQLException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.mvc.DAO.DAO;
import com.mvc.DTO.DTO;

	/**
	 * Servlet implementation class Controller
	 */
	@WebServlet("/Controller")
	public class Controller extends HttpServlet {
		
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			int firstNo = Integer.parseInt(request.getParameter("firstNo"));
			int secondNo = Integer.parseInt(request.getParameter("secondNo"));
			int result = 0 ;
			if (!(request.getParameter("result")==""))
			{
				result = Integer.parseInt(request.getParameter("result"));
			}
			
			DAO dao = new DAO();
			DTO dto = new DTO(firstNo,secondNo,result);
			
			try {
				dao.store(dto);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}


