package com.beeva.app.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import org.springframework.transaction.annotation.Transactional;

import com.beeva.app.dao.ClienteDao;
import com.beeva.app.log.ClienteLog;
import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;

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
		Cliente c = entityManager.find(Cliente.class, id);
		return c;
	}

	@Transactional
	public Cuenta getCuenta(int id) {
		Query c = entityManager.createQuery("Select c from Cuenta c Where idcliente = :id;");
		c.setParameter("id", id);
		Cuenta cu = (Cuenta) c.getSingleResult();
		return cu;
		
	}

	@Transactional
	public Cliente findCliente(int id) {
		
		 Cliente c=entityManager.find(Cliente.class, id);
		 
		 
		 return c;
	}

}
