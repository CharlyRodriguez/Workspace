package com.beeva.app.dao;


import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;



public abstract class CuentaDao {
	public abstract void addCuenta(Cuenta cuenta);
	public abstract boolean Deposito(Cuenta c,double dep);
	public abstract Cuenta findCuenta(Cliente c);
	
	


}
