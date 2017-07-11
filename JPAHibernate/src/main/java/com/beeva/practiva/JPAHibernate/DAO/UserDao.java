package com.beeva.practiva.JPAHibernate.DAO;

import com.beeva.practica.JPAHibernate.model.User;

public abstract class UserDao {
	
	public abstract void saveUser(User user);
	
	public abstract User getUser(int id);

}
