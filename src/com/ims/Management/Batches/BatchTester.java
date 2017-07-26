package com.ims.Management.Batches;

import java.util.ArrayList;

public class BatchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BatchDTO batchDTO=new BatchDTO("114",4,"1152","9 to 6","weekdays","offline");
       BatchController batchController=new BatchController();
       System.out.println(batchController.addBatch(batchDTO));
       batchDTO.setNoOfStudent(20);
       System.out.println(batchController.updateBatch(batchDTO));
       ArrayList<BatchDTO> list=batchController.readBatch(batchDTO);
	    for(BatchDTO a:list) {
	    	System.out.println(a.toString());
	    }
//	    System.out.println(batchController.deleteBatch(batchDTO));
	      
	}

}
