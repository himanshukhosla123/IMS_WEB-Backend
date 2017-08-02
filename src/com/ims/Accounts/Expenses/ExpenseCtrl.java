package com.ims.Accounts.Expenses;

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
 * Servlet implementation class ExpenseCtrl
 */
@WebServlet("/expense")
public class ExpenseCtrl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("choose");
		switch(choice) {
		case "create": {
//			<input type="submit" name="choose" value="create"/>
			boolean change = createExpense(request, response);
			System.out.println("Expense Added : "+ change);
		}break;
		case "readAll": {
//			<input type="button" name="choose" value="readAll"/>
			boolean change = readAllExpense(request, response);
			System.out.println("All Expense Read : "+ change);
		}break;
		case "read": {
//			<input type="button" name="choose" value="read"/>
			boolean change = readExpense(request, response);
			System.out.println("Expense Read : "+ change);
		}break;
		case "update": {
//			<input type="submit" name="choose" value="update"/>
			boolean change = updateExpense(request, response);
			System.out.println("Expense Update : "+ change);
		}break;
		case "delete": {
//			<input type="button" name="choose" value="delete"/>
			boolean change = deleteExpense(request, response);
			System.out.println("Expense Delete : "+ change);
		}break;
		default: {
			System.out.println("WRONG INPUT");
		}
		}
		/*int firstNo=Integer.parseInt(request.getParameter("firstNo"));
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
	}*/
	}

	private boolean createExpense(HttpServletRequest request, HttpServletResponse response) {
		String expenseID = request.getParameter("expenseId");
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date date = null;
		try {
			date = dateFormat.parse(request.getParameter("date"));
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String eID = request.getParameter("eId");
		double expenditure = Double.parseDouble(request.getParameter("expenditure"));
		double advance = Double.parseDouble(request.getParameter("advance"));
		String paymentMode = request.getParameter("paymentMode");
		String chequeID = request.getParameter("chequeId");
		double balance = Double.parseDouble(request.getParameter("balance"));
		String status = request.getParameter("status");
		ExpenseDTO expenseDTO = new ExpenseDTO(expenseID, date, category, description, eID, 
				expenditure, advance, paymentMode, chequeID, balance, status);
		ExpenseDAO expenseDAO = new ExpenseDAO();
		try {
			expenseDAO.addExpense(expenseDTO);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean readAllExpense(HttpServletRequest request, HttpServletResponse response) {
		ExpenseDAO expenseDAO = new ExpenseDAO();
		/*expenseList has to be returned so that it can fill up the fields*/
		ArrayList<ExpenseDTO> expenseList;
		try {
			expenseList = expenseDAO.readAllExpense();
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean readExpense(HttpServletRequest request, HttpServletResponse response) {
		/*Still not fixed - something like this in which you get the id of the one which is selected*/
		String expenseID = request.getParameter("expeneId");
		ExpenseDAO expenseDAO = new ExpenseDAO();
		/*expenseDTO has to be returned so that it can fill up the fields*/
		ExpenseDTO expenseDTO;
		try {
			expenseDTO = expenseDAO.readExpense(expenseID);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean updateExpense(HttpServletRequest request, HttpServletResponse response) {
		String expenseID = request.getParameter("expenseId");
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date date = null;
		try {
			date = dateFormat.parse(request.getParameter("date"));
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String eID = request.getParameter("eId");
		double expenditure = Double.parseDouble(request.getParameter("expenditure"));
		double advance = Double.parseDouble(request.getParameter("advance"));
		String paymentMode = request.getParameter("paymentMode");
		String chequeID = request.getParameter("chequeId");
		double balance = Double.parseDouble(request.getParameter("balance"));
		String status = request.getParameter("status");
		ExpenseDTO expenseDTO = new ExpenseDTO(expenseID, date, category, description, eID, 
				expenditure, advance, paymentMode, chequeID, balance, status);
		ExpenseDAO expenseDAO = new ExpenseDAO();
		try {
			expenseDAO.updateExpense(expenseDTO);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean deleteExpense(HttpServletRequest request, HttpServletResponse response) {
		/*Still not fixed - something like this in which you get the id of the one which is selected*/
		String expenseID = request.getParameter("expeneId");
		ExpenseDAO expenseDAO = new ExpenseDAO();
		try {
			expenseDAO.deleteExpense(expenseID);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}


/*
String button1 = request.getParameter("button1");
String button2 = request.getParameter("button2");
the value which isn't null is the pressed button.

Or, if you want to use the same name for the two buttons you can set a different value

<input type="submit" name="act" value="delete"/>
<input type="submit" name="act" value="update"/>
Then

String act = request.getParameter("act");
if (act == null) {
    //no button has been selected
} else if (act.equals("delete")) {
    //delete button was pressed
} else if (act.equals("update")) {
    //update button was pressed
} else {
    //someone has altered the HTML and sent a different value!
}*/
