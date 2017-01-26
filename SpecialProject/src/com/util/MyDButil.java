package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDButil {
	 
		@SuppressWarnings("finally")
		public static Connection getConnection() {
			 
			 Connection con=null;
		try {
		      Class.forName("org.postgresql.Driver");
		      String url="jdbc:postgresql://127.0.0.1:5432/NewDB";
		      con=DriverManager.getConnection(url,"postgres","postgres");
		    }
		
		catch (Exception e)
		    {
			System.out.println(e);
		    }
		
		finally {
	       
			return con;
		         
		         }
		
		 }
		
		 public static void closeConnection(Connection dbConnection) {
		        try {
		            dbConnection.close();
		            dbConnection=null;
		            } catch (SQLException e) {
		             
		            e.printStackTrace();
		            }
		 
		    }

}
