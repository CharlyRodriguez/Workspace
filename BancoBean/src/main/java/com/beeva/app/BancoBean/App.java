package com.beeva.app.BancoBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("BancoBeans.xml");
        Cliente cliente =(Cliente) context.getBean("cliente");
        Cuenta cuenta = (Cuenta) context.getBean("cuenta");
        System.out.println(cliente.getNombre()+" "+ cliente.getApellido()+" "+cliente.getCuenta().getBalance()+" "+cliente.getCuenta().getTipoCuenta());
    }
}
