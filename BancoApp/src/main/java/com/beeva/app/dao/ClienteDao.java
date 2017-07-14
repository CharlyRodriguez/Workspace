package com.beeva.app.dao;

import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;

public abstract class ClienteDao {
	public abstract void addCliente(Cliente cliente);
	public abstract Cliente findCliente(int id);
	
}
