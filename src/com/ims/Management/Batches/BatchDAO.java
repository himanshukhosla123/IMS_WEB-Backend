package com.ims.Management.Batches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.ICourseBatch;
import com.ims.Management.Batches.BatchDTO;

public class BatchDAO {

	public boolean addBatch(BatchDTO batchDTO) throws SQLException, ClassNotFoundException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.ADDBATCH);
			ps.setString(1,batchDTO.getBatchId());
			ps.setInt(2, batchDTO.getNoOfStudent());
			ps.setString(3, batchDTO.getCourseId());
			ps.setString(4, batchDTO.getTiming());
			ps.setString(5, batchDTO.getClassDays());
			ps.setString(6, batchDTO.getClassMode());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally{
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
			
	}
	
	public ArrayList<BatchDTO> readBatch(BatchDTO batchDTO) throws SQLException, ClassNotFoundException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ArrayList<BatchDTO> batchList=new ArrayList<>();
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.SELECTBATCH);
			rs=ps.executeQuery();
			while(rs.next()) {
				batchList.add(new BatchDTO(rs.getString(1),rs.getInt(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
			return batchList;
		}
		finally {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	

	public boolean updateBatch(BatchDTO batchDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.UPDATEBATCH);
			ps.setInt(1,batchDTO.getNoOfStudent());
			ps.setString(2,batchDTO.getTiming());
			ps.setString(3,batchDTO.getClassDays());
			ps.setString(4,batchDTO.getClassMode());
			ps.setString(5,batchDTO.getBatchId());
			ps.setString(6, batchDTO.getCourseId());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	
	public boolean deleteBatch(BatchDTO batchDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.DELETEBATCH);
			ps.setString(1,batchDTO.getBatchId());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
		
	}

	
}
