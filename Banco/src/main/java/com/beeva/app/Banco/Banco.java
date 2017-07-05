package com.beeva.app.Banco;

public class Banco {
	private Cliente[] clientes = new Cliente[10];
	private int nclientes;
	
	 public Cliente[] addCliente(Cliente c){
			 clientes[nclientes]=c;
			 nclientes++;
		 return clientes;
		 
	 }
	 public int getNCliente(){
		  nclientes = clientes.length;
		 return nclientes;
	 }
	 public Cliente getCliente(int n){
		 return clientes[n];
		 
	 }

}
