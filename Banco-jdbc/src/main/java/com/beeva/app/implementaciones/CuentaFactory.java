package com.beeva.app.implementaciones;

import com.beeva.app.interfaces.CuentaDao;
import com.beeva.app.model.Cuenta;

public class CuentaFactory {
	
	public CuentaDao getImplement(Cuenta c){
		//verifica el tipo de cuenta entre 1 y 2 para instanciar la clase respectiva de cada tipo
		//para acceder a diferentes implementacones de los metodos de la interfaz CuentaDao
		if(c.getTipoCuenta()==1){
			CuentaAhorro ahorro = new CuentaAhorro();
			return ahorro;
		}else if (c.getTipoCuenta()==2) {
			CuentaCheques cheques = new CuentaCheques();
			return cheques;
		}
		//regresa una clase CuentaDao nula
		CuentaDao ninguna = null;
		return ninguna;
		
	}
}
