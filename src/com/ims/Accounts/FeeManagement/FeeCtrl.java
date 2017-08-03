package com.ims.Accounts.FeeManagement;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * Servlet implementation class FeeCtrl
 */
@WebServlet("/fee")
public class FeeCtrl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		FeeDAO feeDAO = new FeeDAO();
		FeeDTO feeDTO;
		String json;
		
//		response.setContentType("application/json");
		String method = request.getParameter("method");
		String jsonDTO = request.getParameter("dto_obj");
		try{
			switch(method) {
			case "add": {
				feeDTO = mapper.readValue(jsonDTO, new TypeReference<FeeDTO>(){});
				feeDTO = feeDAO.addFee(feeDTO);
				json = mapper.writeValueAsString(feeDTO);
				response.getWriter().println(json);
			}break;
			
			case "readAll": {
				ArrayList<FeeDTO> feeList = feeDAO.readAllFee();	
				json = mapper.writeValueAsString(feeList);
				response.getWriter().println(json);
			}break;
			
			case "read": {
				feeDTO = mapper.readValue(jsonDTO, new TypeReference<FeeDTO>(){});
				feeDTO = feeDAO.readFee(feeDTO);
				json = mapper.writeValueAsString(feeDTO);
				response.getWriter().println(json);
			}break;
			
			case "update": {
				feeDTO = mapper.readValue(jsonDTO, new TypeReference<FeeDTO>(){});
				feeDTO = feeDAO.updateFee(feeDTO);
				json = mapper.writeValueAsString(feeDTO);
				response.getWriter().println(json);
			}break;
			
			case "delete": {
				feeDTO = mapper.readValue(jsonDTO, new TypeReference<FeeDTO>(){});
				feeDTO =  feeDAO.deleteFee(feeDTO);
				json = mapper.writeValueAsString(feeDTO);
				response.getWriter().println(json);
			}break;
			default: {
				System.out.println("WRONG INPUT");
			}
		}
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			e.printStackTrace();
		}
	}
}
