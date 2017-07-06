package com.beeva.app.interfaces;

import com.beeva.app.model.Cliente;

public interface CuentaDao {
	public boolean Deposito(Cliente c,double dep);
	public boolean Retiro(Cliente c,double ret);
	

}
