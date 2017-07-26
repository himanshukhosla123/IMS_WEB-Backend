/**
 * 
 */
package com.ims.Common.CommonDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author admin
 *
 */
public interface IAdministratorSql {
	public static Connection getConnection() throws ClassNotFoundException,SQLException  {
		String dbURL = "jdbc:mysql://localhost:3306/imsweb";
		//Driver load
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,"root","sanuj");
		return con;
	} 
	
}
