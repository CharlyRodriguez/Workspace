package com.beeva.app.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import org.springframework.transaction.annotation.Transactional;

import com.beeva.app.dao.ClienteDao;
import com.beeva.app.log.ClienteLog;
import com.beeva.app.model.Cliente;

@Repository
public class ClienteImpl extends ClienteDao{

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Transactional
	public void addCliente(Cliente cliente) {
		entityManager.persist(cliente);
		ClienteLog cl = new ClienteLog();
        cl.log(cliente);
	}
	
	
	
	public Cliente getCliente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
