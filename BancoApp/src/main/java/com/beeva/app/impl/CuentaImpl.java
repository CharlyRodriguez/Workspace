package com.beeva.app.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.app.dao.CuentaDao;
import com.beeva.app.log.CuentaLog;
import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;
@Repository
public class CuentaImpl extends CuentaDao {
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void addCuenta(Cuenta cuenta) {
		entityManager.persist(cuenta);
		CuentaLog cl = new CuentaLog();
        cl.log(cuenta);
		
	}

	@Transactional
	public boolean Deposito(Cuenta c, double dep) {
		double op = c.getBalance()+dep;
		c.setBalance(op);
		entityManager.merge(c);
		return true;
	}
	
	
	@Override
	public Cuenta findCuenta(Cliente c) {
		 Query query = entityManager.createQuery("Select e from Cuenta e where e.id = :id");
		 query.setParameter("id", c.getId());
		 Cuenta cu = (Cuenta) query.getSingleResult();
	     return cu;
	}
	



}
