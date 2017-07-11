package com.beeva.app.dao;

import com.beeva.app.model.Cliente;

public abstract class ClienteDao {
	public abstract void addCliente(Cliente cliente);
	public abstract Cliente getCliente(int id);

}
