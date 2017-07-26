package com.ims.Management.Enquiry;

import java.sql.SQLException;
import java.util.ArrayList;

public class EnquiryController {

	public boolean addEnquiry(EnquiryDTO enquiryDTO) {
		EnquiryDAO enquiryDAO=new EnquiryDAO();
		try {
			return enquiryDAO.addEnquiry(enquiryDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean updateEnquiry(EnquiryDTO enquiryDTO) {
		EnquiryDAO enquiryDAO=new EnquiryDAO();
		try {
			return enquiryDAO.updateEnquiry(enquiryDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList<EnquiryDTO> readEnquiry(EnquiryDTO enquiryDTO) {
		EnquiryDAO enquiryDAO=new EnquiryDAO();
		try {
			return enquiryDAO.readEnquiry(enquiryDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean deleteEnquiry(EnquiryDTO enquiryDTO) {
		EnquiryDAO enquiryDAO=new EnquiryDAO();
		try {
			return enquiryDAO.deleteEnquiry(enquiryDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
}
