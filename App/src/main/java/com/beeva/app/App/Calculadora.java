package com.beeva.app.App;

public class Calculadora {
	
	public int suma(int a, int b){
		int res =a+b;
		return res;
	}
	public int resta(int a, int b){
		int res =a-b;
		return res;
	}
	public int multiplicacion(int a, int b){
		int res =a*b;
		return res;
	}
	public String division(int a, int b){
		try{
			int res =a/b;
			return String.valueOf(res);
			}catch(Exception e){
				String error ="No se puede dividir 0 entre 0";
			return error;
			}
	}

}
