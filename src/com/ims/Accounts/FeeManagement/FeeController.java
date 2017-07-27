package com.ims.Accounts.FeeManagement;

import java.sql.SQLException;

import com.ims.Common.Utils.TableConstants;

public class FeeController {
	
	private static int paymentIdGenerator() {
		int paymentId = 0;
		//logic here
		return paymentId;
	}
	
	public int generatePaymentId() {
		int paymentId = paymentIdGenerator();
		return paymentId;
	}
	
	public void readFee(FeeDTO feeDTO, PaymentDTO paymentDTO) throws ClassNotFoundException, SQLException {
//		CourseController courseCtrl = new CourseController();
//		double courseFee = courseCtrl.getCourseFee();
		FeeDAO feeDAO = new FeeDAO();
		double courseFee = 0;
		checkStatus(feeDTO.getStatus()); //paid or not
		isAlreadyExist(); //if he has paid any or not
		/*if(paymentDTO.getPayment() < courseFee) {
			return;
		}
		else if(paymentDTO.getPayment() == courseFee) {
			feeDAO.addFee();
		}
		else {
			return;
		}*/
	}
	
	private void checkStatus(String status) {
		if(status == TableConstants.FEE_PENDING) {
			
		}
		else if(status == TableConstants.FEE_PAID) {
			
		}
	}

	private void isAlreadyExist() {

	}
	
	private boolean checkFee() {
		return false;
	}

	private boolean checkFeeStatus(double paidFee, double courseFee) {
		return false;
	}
	
	private boolean alreadyPaid() {

		return true;
	}
	

}
