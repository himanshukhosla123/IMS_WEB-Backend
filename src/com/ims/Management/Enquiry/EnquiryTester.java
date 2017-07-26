package com.ims.Management.Enquiry;

import java.util.ArrayList;

public class EnquiryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnquiryDTO enquiryDTO=new EnquiryDTO("himanshu","9818478695","himanshukhosla","how to join","call me back","pending");
        EnquiryController enquiryController=new EnquiryController();
        System.out.println(enquiryController.addEnquiry(enquiryDTO));
        enquiryDTO.setName("hk");
        System.out.println(enquiryController.updateEnquiry(enquiryDTO));
        ArrayList<EnquiryDTO> list=enquiryController.readEnquiry(enquiryDTO);
	    for(EnquiryDTO a:list) {
	    	System.out.println(a.toString());
	    }
	    System.out.println(enquiryController.deleteEnquiry(enquiryDTO));
	    
	}
	
}
