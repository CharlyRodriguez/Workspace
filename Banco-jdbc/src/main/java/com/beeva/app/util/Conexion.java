package com.beeva.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public Connection conexion(){
	
	 try {
		Connection	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banco","root","root");
		return connection;
		
		} catch (SQLException e) {
			System.out.println("Fallo la conexion");
			e.printStackTrace();
			return null;
		}
	}
    
}
