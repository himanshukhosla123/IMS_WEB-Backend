package com.ims.Management.Enquiry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.IEnquiry;

public class EnquiryDAO {

	public boolean addEnquiry(EnquiryDTO enquiryDTO) throws SQLException, ClassNotFoundException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(IEnquiry.ADDENQUIRY);
			ps.setString(1,enquiryDTO.getName());
			ps.setString(2, enquiryDTO.getPhnNo());
			ps.setString(3, enquiryDTO.getEmail());
			ps.setString(4, enquiryDTO.getTitle());
			ps.setString(5, enquiryDTO.getDesc());
			ps.setString(6, enquiryDTO.getStatus());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
			
	}
	
	public ArrayList<EnquiryDTO> readEnquiry(EnquiryDTO enquiryDTO) throws SQLException, ClassNotFoundException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ArrayList<EnquiryDTO> enquiryList=new ArrayList<>();
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(IEnquiry.SELECTENQUIRY);
			rs=ps.executeQuery();
			while(rs.next()) {
				enquiryList.add(new EnquiryDTO(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
			return enquiryList;
		}
		finally {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	

	public boolean updateEnquiry(EnquiryDTO enquiryDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(IEnquiry.UPDATEENQUIRY);
			ps.setString(1,enquiryDTO.getName());
			ps.setString(2, enquiryDTO.getEmail());
			ps.setString(3, enquiryDTO.getTitle());
			ps.setString(4, enquiryDTO.getDesc());
			ps.setString(5, enquiryDTO.getStatus());
			ps.setString(6, enquiryDTO.getPhnNo());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	
	public boolean deleteEnquiry(EnquiryDTO enquiryDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(IEnquiry.DELETEENQUIRY);
			ps.setString(1, enquiryDTO.getPhnNo());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
		
	}
	

}


