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
		FeeDAO feeDAO = new FeeDAO();
		switch(choice) {
		case "create": {
//			<input type="submit" name="choose" value="create"/>
			boolean change = createFee(feeDAO);
			System.out.println("Fee Added : "+ change);
		}break;
		case "readAll": {
//			<input type="button" name="choose" value="readAll"/>
			ArrayList<FeeDTO> feeList = readAllFee(feeDAO);
			System.out.println("All Fee Read : "+ feeList);
		}break;
		case "read": {
//			<input type="button" name="choose" value="read"/>
			FeeDTO feeDTO = readFee(feeDAO);
			System.out.println("Fee Read : "+ feeDTO);
		}break;
		case "update": {
//			<input type="submit" name="choose" value="update"/>
			boolean change = updateFee(feeDAO);
			System.out.println("Fee Update : "+ change);
		}break;
		case "delete": {
//			<input type="button" name="choose" value="delete"/>
			boolean change = deleteFee(feeDAO);
			System.out.println("Fee Delete : "+ change);
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

	private boolean createFee(FeeDAO feeDAO) {
//		READ THROUGH JSON
		FeeDTO feeDTO = new FeeDTO("101", "101", "101", "101", 101, 101, "101", 
				"101", new Date(), new Date(), 101, 101, "101");
		try {
			feeDAO.addFee(feeDTO);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private ArrayList<FeeDTO> readAllFee(FeeDAO feeDAO) {
//		READ THROUGH JSON
		/*feeList has to be returned so that it can fill up the fields*/
		try {
			return feeDAO.readAllFee();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private FeeDTO readFee(FeeDAO feeDAO) {
//		READ THROUGH JSON
		/*Still not fixed - something like this in which you get the id of the one which is selected*/
		/*feeDTO has to be returned so that it can fill up the fields*/
		try {
			return feeDAO.readFee("101");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private boolean updateFee(FeeDAO feeDAO) {
//		READ THROUGH JSON
		FeeDTO feeDTO = new FeeDTO("101", "101", "101", "101", 
				101, 101, "101", "101", new Date(), new Date(), 101, 101, "101");
		try {
			feeDAO.addFee(feeDTO);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean deleteFee(FeeDAO feeDAO) {
//		READ THROUGH JSON
		/*Still not fixed - something like this in which you get the id of the one which is selected*/
		try {
			feeDAO.deleteFee("101");
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

/*public void readFee(FeeDTO feeDTO, PaymentDTO paymentDTO) throws ClassNotFoundException, SQLException {
//CourseController courseCtrl = new CourseController();
//double courseFee = courseCtrl.getCourseFee();
FeeDAO feeDAO = new FeeDAO();
double courseFee = 0;
if(checkStatus(feeDTO.getStatus()) == 1){
	//paid or not
	
}
isAlreadyExist(); //if he has paid any or not
if(paymentDTO.getPayment() < courseFee) {
	return;
}
else if(paymentDTO.getPayment() == courseFee) {
	feeDAO.addFee();
}
else {
	return;
}
}

private int checkStatus(String status) {
if(status == TableConstants.FEE_DUE) {
	return 1;
}
else if(status == TableConstants.FEE_PAID) {
	return -1;
}
return 0;
}

private void isAlreadyExist() {
//if()
}

private boolean checkFee() {
return false;
}

private boolean checkFeeStatus(double paidFee, double courseFee) {
return false;
}

private boolean alreadyPaid() {
//if()
return true;
}
*/
