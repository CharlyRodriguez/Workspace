package com.beeva.app.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.saluda.Saludador;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Saludador obj =(Saludador) context.getBean("saludador");
        
        
    }
}
