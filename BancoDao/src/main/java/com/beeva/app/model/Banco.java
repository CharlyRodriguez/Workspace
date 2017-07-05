package com.beeva.app.model;


public class Banco {
	private Cliente[] clientes = new Cliente[10];
	private int nclientes;
	
	 public boolean addCliente(Cliente c){
			 clientes[nclientes]=c;
			 nclientes++;
		 return true;
		 
	 }
	 public int getNCliente(){
		  nclientes = clientes.length;
		 return nclientes;
	 }
	 public Cliente getCliente(int n){
		 return clientes[n];
		 
	 }

}
