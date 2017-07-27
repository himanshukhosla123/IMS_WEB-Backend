package com.ims.Accounts.FeeManagement;

import java.sql.SQLException;
import java.util.ArrayList;

public class FeeController {
	
	public boolean createFee(FeeDTO feeDTO, PaymentDTO paymentDTO) {
		FeeDAO feeDAO = new FeeDAO();
		try {
			if(feeDAO.addFee(feeDTO)) {
				if(createFee(paymentDTO)) {
					return true;
				}
				else {
					feeDAO.deleteFee(feeDTO.getStuFeeID());
					return false;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean createFee(PaymentDTO paymentDTO) {
		PaymentController paymentController = new PaymentController();
		return paymentController.createPayment(paymentDTO);
	}
	
	public ArrayList<FeeDTO> readFee() {
		FeeDAO feeDAO = new FeeDAO();
		try {
			return feeDAO.readFee();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateFee(FeeDTO feeDTO) {
		FeeDAO feeDAO = new FeeDAO();
		try {
			return feeDAO.updateFee(feeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//Only when a student is forcefully removed with payment repaid
	//when student is deleted
	public boolean deleteFee(FeeDTO feeDTO) {
		FeeDAO feeDAO = new FeeDAO();
		try {
			if(feeDAO.deleteFee(feeDTO.getStuFeeID())) {
				PaymentController paymentController = new PaymentController();
				if(paymentController.deletePayment(feeDTO.getStuFeeID())) {
					return true;
				}
				else {
					feeDAO.addFee(feeDTO);
					return false;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int generatePaymentId() {
		int paymentId = 0;
		return paymentId;
	}
	
	/*public void readFee(FeeDTO feeDTO, PaymentDTO paymentDTO) throws ClassNotFoundException, SQLException {
//		CourseController courseCtrl = new CourseController();
//		double courseFee = courseCtrl.getCourseFee();
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
//		if()
	}
	
	private boolean checkFee() {
		return false;
	}

	private boolean checkFeeStatus(double paidFee, double courseFee) {
		return false;
	}
	
	private boolean alreadyPaid() {
//		if()
		return true;
	}
	*/

}
