package com.ims.Accounts.FeeManagement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class PaymentController {
	
	public boolean createPayment(PaymentDTO paymentDTO) {
		PaymentDAO paymentDAO = new PaymentDAO();
		try {
			return paymentDAO.addPayment(paymentDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<PaymentDTO> readPayment() {
		PaymentDAO feeDAO = new PaymentDAO();
		try {
			return feeDAO.readPayment();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updatePayment(PaymentDTO paymentDTO) {
		PaymentDAO paymentDAO = new PaymentDAO();
		try {
			return paymentDAO.updatePayment(paymentDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//In real world Payment will not be deleted
	//only when student is forcefully removed
	public boolean deletePayment(int stuFeeId) {
		PaymentDAO paymentDAO = new PaymentDAO();
		try {
			return paymentDAO.deletePayment(stuFeeId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deletePayment(int stuFeeId, Date date) {
		PaymentDAO paymentDAO = new PaymentDAO();
		try {
			return paymentDAO.deletePayment(stuFeeId, date);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
