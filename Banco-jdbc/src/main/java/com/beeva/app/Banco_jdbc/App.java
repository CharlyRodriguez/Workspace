package com.beeva.app.Banco_jdbc;

import java.sql.ResultSet;
import java.util.Scanner;

import com.beeva.app.util.Conexion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Scanner read = new Scanner(System.in);
        Conexion con = new Conexion();
        System.out.println("Banco: ");
        String banco = read.nextLine();
        
        
        System.out.println("Nombre: ");
        String nombre = read.nextLine();
        System.out.println("Apellido: ");
        String apellido = read.nextLine();
        System.out.println("Balance: ");
        String balance = read.nextLine();
        System.out.println("Tipo de cuenta: ");
        int cuenta = read.nextInt();
        read.nextLine();
        
        if(con !=null){
        	System.out.println("Conectado a la base de datos");
        	String insertcliente="insert into cliente (nombre,apellido) values('"+nombre+"','"+apellido+"');";
        	String insertbanco="insert into banco (nombre) values('"+banco+"');";
        	String insertcuenta="insert into cuenta (balance,idtipocuenta,idcliente) values('"+balance+"','"+cuenta+"','"+idcliente+"');";
        	String querycliente="Select * from cliente";
        	String querybanco="Select * from banco";
        	try {
        		con.conexion().prepareStatement(insertcliente).executeUpdate();
        		
        		ResultSet rs = con.conexion().prepareStatement(querycliente).executeQuery();
        		while (rs.next()) {
					System.out.println(rs.getString("nombre") +" "+ rs.getString("apellido"));
				}
        		
			} catch (Exception e) {
				System.out.println("nope");
				System.out.println(e);
			}
        	
        }else {
			System.out.println("Nel prro");
		}
    }
}
