package com.beeva.app.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.app.dao.BancoDao;
import com.beeva.app.log.Bancolog;
import com.beeva.app.model.Banco;

@Repository
public class BancoImpl extends BancoDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void addBanco(Banco banco) {
		entityManager.merge(banco);
		Bancolog bl = new Bancolog();
        bl.log(banco);
		
	}

	@Override
	public Banco getBanco(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Banco> findAll() {
		Query q = entityManager.createNamedQuery("select * from banco");
		@SuppressWarnings("unchecked")
		List<Banco> lista= q.getResultList();
		return lista;

	}

}
