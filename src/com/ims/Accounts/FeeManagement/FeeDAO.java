package com.ims.Accounts.FeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.Utils.SqlQuery;

public class FeeDAO {
	
	public int addFee() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SqlQuery.ADD_FEE_ATT);
//			pstmt.setInt(1, dto.getsId());
//			pstmt.setInt(2, dto.getbId());
//			pstmt.setDate(3, new java.sql.Date(dto.getDate().getTime()));
//			pstmt.setString(4, dto.getStatus());
			int recordCount = pstmt.executeUpdate();
			return recordCount;
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}
	
	/*public boolean isAlreadyPaid() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = con.prepareStatement(SqlQuery.IF_FEE_PAID);
		return false;
	}*/
	
	public boolean isAlreadyExist() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = con.prepareStatement(SqlQuery.IF_FEE_PAID);
		return false;
	}

}
