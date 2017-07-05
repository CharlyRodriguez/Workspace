package com.beeva.app.example3;


public class Main{
	public static void main(String[] args) {
		
		
			if(args[0].equals("suma")){
			int res =Integer.parseInt(args[1])+Integer.parseInt(args[2]);
			System.out.println(res);
		}else if(args[0].equals("resta")){
			int res =Integer.parseInt(args[1])-Integer.parseInt(args[2]);
			System.out.println(res);
		}else if(args[0].equals("multiplicacion")){
			int res =Integer.parseInt(args[1])*Integer.parseInt(args[2]);
			System.out.println(res);
		}else if(args[0].equals("division")){
			try{
			int res =Integer.parseInt(args[1])/Integer.parseInt(args[2]);
			System.out.println(res);
			}catch(Exception e){
			System.out.println("No se puede dividir entre 0");
			}
		}
		
		
	}
}