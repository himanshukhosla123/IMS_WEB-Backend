package angulartest;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultCtrl
 */
@SuppressWarnings("serial")
@WebServlet("/Controller")
public class ResultCtrl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		int firstNo=Integer.parseInt(request.getParameter("firstNo"));
		int secondNo=Integer.parseInt(request.getParameter("secondNo"));
		int result=Integer.parseInt(request.getParameter("result"));
		ResultDTO resultDTO=new ResultDTO(firstNo,secondNo,result);
		System.out.println(resultDTO.toString());
        ResultDAO resultDAO= new ResultDAO();
        boolean isAdded=false;
	    try {
			isAdded = resultDAO.addResult(resultDTO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        if(isAdded==true)System.out.println("entery done");
        else System.out.println("entry cant happen");
	}

}
