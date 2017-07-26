package com.ims.Management.Batches;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Management.Batches.BatchDAO;
import com.ims.Management.Batches.BatchDTO;

public class BatchController {

	public boolean addBatch(BatchDTO batchDTO) {
		BatchDAO batchDAO=new BatchDAO();
		try {
			return batchDAO.addBatch(batchDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean updateBatch(BatchDTO batchDTO) {
		BatchDAO batchDAO=new BatchDAO();
		try {
			return batchDAO.updateBatch(batchDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList<BatchDTO> readBatch(BatchDTO batchDTO) {
		BatchDAO batchDAO=new BatchDAO();
		try {
			return batchDAO.readBatch(batchDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean deleteBatch(BatchDTO batchDTO) {
		BatchDAO batchDAO=new BatchDAO();
		try {
			return batchDAO.deleteBatch(batchDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
}
