package com.beeva.practica.JPAHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.practica.JPAHibernate.Impl.UserDaoImpl;
import com.beeva.practica.JPAHibernate.model.User;
import com.beeva.practiva.JPAHibernate.DAO.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
		UserDao userDao = (UserDao) context.getBean(UserDaoImpl.class);
    	
        User usuario = new User();
        usuario.setDireccion("Calle sola");
        usuario.setNombre("Carlos");
        
        userDao.saveUser(usuario);
        
        		
    }
}
