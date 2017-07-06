package com.beeva.app.implementaciones;

import java.util.Date;

import com.beeva.app.interfaces.CuentaDao;
import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;

public class CuentaCheques extends Cuenta implements CuentaDao{

	public boolean Deposito(Cliente c, double dep) {
		double op = c.getCuenta().getBalance()+dep;
		c.getCuenta().setBalance(op);
		return true;
	}

	public boolean Retiro(Cliente c, double ret) {
		double op = c.getCuenta().getBalance()-ret;
		c.getCuenta().setBalance(op);
		return true;
	}

	

}
