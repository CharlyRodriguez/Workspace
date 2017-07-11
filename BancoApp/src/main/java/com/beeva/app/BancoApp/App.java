package com.beeva.app.BancoApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.dao.ClienteDao;
import com.beeva.app.impl.ClienteImpl;
import com.beeva.app.log.ClienteLog;
import com.beeva.app.model.Cliente;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
		ClienteDao clienteDao = (ClienteDao) context.getBean(ClienteImpl.class);
    	
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos1");
        cliente.setApellido("de la Rosa1" );
        clienteDao.addCliente(cliente);
        
    }
}
