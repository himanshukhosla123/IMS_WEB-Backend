package com.ims.Common.CommonDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		String dburl = "jdbc:mysql://localhost:3306/imsweb";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, "root", "1234");
		return con;

	}

}
