package com.onemars.model.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
	
	private static String URL = "jdbc:mysql://localhost:3306/onemars";
    private static String LOGIN = "onemars";
    private static String PASSWORD = "onemars";
    
    private static Connection connect;
    
    private static void createConnection() {
    	
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			
		} catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
			
		}
		
	}
    
    public static Connection getConnexion(){
    	
		if(connect == null){
			
			createConnection();
			
	    }
		
	    return connect;
		
	}
	
	
	
	public void close() throws Exception{
		
		connect.close();
		
	}

}
