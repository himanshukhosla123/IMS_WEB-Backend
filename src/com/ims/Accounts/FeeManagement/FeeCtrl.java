package com.ims.Accounts.FeeManagement;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeeCtrl
 */
@WebServlet("/fee")
public class FeeCtrl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("choose");
		switch(choice) {
		case "create": {
//			<input type="submit" name="choose" value="create"/>
			boolean change = createFee(request, response);
			System.out.println("Fee Added : "+ change);
		}break;
		case "readAll": {
//			<input type="button" name="choose" value="readAll"/>
			boolean change = readAllFee(request, response);
			System.out.println("All Fee Read : "+ change);
		}break;
		case "read": {
//			<input type="button" name="choose" value="read"/>
			boolean change = readFee(request, response);
			System.out.println("Fee Read : "+ change);
		}break;
		case "update": {
//			<input type="submit" name="choose" value="update"/>
			boolean change = updateFee(request, response);
			System.out.println("Fee Update : "+ change);
		}break;
		case "delete": {
//			<input type="button" name="choose" value="delete"/>
			boolean change = deleteFee(request, response);
			System.out.println("Fee Delete : "+ change);
		}break;
		default: {
			System.out.println("WRONG INPUT");
		}
		}
	}

	private boolean createFee(HttpServletRequest request, HttpServletResponse response) {
		String tID = request.getParameter("tId");
		String sID = request.getParameter("sId");
		String bID = request.getParameter("bId");
		String cID = request.getParameter("cId");
		double courseAmount = Double.parseDouble(request.getParameter("courseAmount"));
		double payableAmount = Double.parseDouble(request.getParameter("payableAmount"));
		String paymentMode = request.getParameter("paymentMode");
		String chequeID = request.getParameter("chequeId");
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date paymentDate = null;
		Date installmentDate = null;
		try {
			paymentDate = dateFormat.parse(request.getParameter("paymentDate"));
			installmentDate = dateFormat.parse(request.getParameter("installmentDate"));
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		double payment = Double.parseDouble(request.getParameter("payment"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		String status = request.getParameter("status");
		FeeDTO feeDTO = new FeeDTO(tID, sID, bID, cID, courseAmount, payableAmount, paymentMode, 
				chequeID, paymentDate, installmentDate, payment, balance, status);
		FeeDAO feeDAO = new FeeDAO();
		try {
			feeDAO.addFee(feeDTO);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean readAllFee(HttpServletRequest request, HttpServletResponse response) {
		FeeDAO feeDAO = new FeeDAO();
		/*feeList has to be returned so that it can fill up the fields*/
		ArrayList<FeeDTO> feeList;
		try {
			feeList = feeDAO.readAllFee();
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean readFee(HttpServletRequest request, HttpServletResponse response) {
		/*Still not fixed - something like this in which you get the id of the one which is selected*/
		String tID = request.getParameter("tId");
		FeeDAO feeDAO = new FeeDAO();
		/*feeDTO has to be returned so that it can fill up the fields*/
		FeeDTO feeDTO;
		try {
			feeDTO = feeDAO.readFee(tID);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean updateFee(HttpServletRequest request, HttpServletResponse response) {
		String tID = request.getParameter("tId");
		String sID = request.getParameter("sId");
		String bID = request.getParameter("bId");
		String cID = request.getParameter("cId");
		double courseAmount = Double.parseDouble(request.getParameter("courseAmount"));
		double payableAmount = Double.parseDouble(request.getParameter("payableAmount"));
		String paymentMode = request.getParameter("paymentMode");
		String chequeID = request.getParameter("chequeId");
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date paymentDate = null;
		Date installmentDate = null;
		try {
			paymentDate = dateFormat.parse(request.getParameter("paymentDate"));
			installmentDate = dateFormat.parse(request.getParameter("installmentDate"));
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		double payment = Double.parseDouble(request.getParameter("payment"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		String status = request.getParameter("status");
		FeeDTO feeDTO = new FeeDTO(tID, sID, bID, cID, courseAmount, payableAmount, paymentMode, 
				chequeID, paymentDate, installmentDate, payment, balance, status);
		FeeDAO feeDAO = new FeeDAO();
		try {
			feeDAO.addFee(feeDTO);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean deleteFee(HttpServletRequest request, HttpServletResponse response) {
		/*Still not fixed - something like this in which you get the id of the one which is selected*/
		String tID = request.getParameter("tId");
		FeeDAO feeDAO = new FeeDAO();
		try {
			feeDAO.deleteFee(tID);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
