package com.beeva.practica.JPAHibernate.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.practica.JPAHibernate.model.User;
import com.beeva.practiva.JPAHibernate.DAO.UserDao;

@Repository

public class UserDaoImpl extends UserDao{
	
	@PersistenceContext
	
	EntityManager entityManager;

	@Transactional
	public void saveUser(User user) {
		entityManager.persist(user);//
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
