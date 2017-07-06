package com.beeva.app.implementaciones;

import com.beeva.app.interfaces.CuentaDao;
import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;

public class CuentaAhorro extends Cuenta implements CuentaDao  {

	public boolean Deposito(Cliente c, double dep) {
		double op = c.getCuenta().getBalance()+dep;
		c.getCuenta().setBalance(op);
		return true;
	}

	public boolean Retiro(Cliente c, double ret) {
		if(c.getCuenta().getBalance()>5000){
			double op = c.getCuenta().getBalance()-ret;
			c.getCuenta().setBalance(op);
			return true;
		}
		return false;
	}

	

}
