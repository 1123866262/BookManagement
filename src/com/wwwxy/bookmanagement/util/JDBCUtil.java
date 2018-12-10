package com.wwwxy.bookmanagement.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCUtil {
	
		private Connection conn;
		public Connection getConnection() {
	        try {
	        	Class.forName("com.mysql.jdbc.Driver");
	            conn = 
	            DriverManager.getConnection("jdbc:mysql://jimxu.top:3306/wwwxy", "wwwxy", "1234");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn;

	    }
		public void close(Connection conn,PreparedStatement pstmt,ResultSet rs) throws SQLException{
			if(rs != null){
				rs.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(conn != null){
				conn.close();
			}
		}
}
