package com.beeva.app.implementaciones;

import com.beeva.app.interfaces.CuentaDao;
import com.beeva.app.model.Cuenta;

public class CuentaFactory {
	
	public CuentaDao getImplement(Cuenta c){
		if(c.getTipoCuenta()==1){
			CuentaAhorro ahorro = new CuentaAhorro();
			return ahorro;
		}else if (c.getTipoCuenta()==2) {
			CuentaCheques cheques = new CuentaCheques();
			return cheques;
		}
		
		CuentaDao ninguna = null;
		return ninguna;
		
	}
}
