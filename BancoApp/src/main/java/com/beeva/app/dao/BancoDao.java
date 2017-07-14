package com.beeva.app.dao;

import java.util.List;

import com.beeva.app.model.Banco;

public abstract class BancoDao {
	public abstract void addBanco(Banco banco);
	public abstract Banco getBanco(int id);
	public abstract List<Banco> findAll();

}
