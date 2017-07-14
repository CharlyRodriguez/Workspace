package com.beeva.app.BancoApp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.dao.ClienteDao;
import com.beeva.app.dao.CuentaDao;

import com.beeva.app.impl.ClienteImpl;

import com.beeva.app.impl.CuentaImpl;
import com.beeva.app.model.Cliente;
import com.beeva.app.model.Cuenta;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
    	Scanner read = new Scanner(System.in);
    	
    	while (true) {
    		System.out.println("1.- crear cliente");
        	System.out.println("2.- Depositar");
        	System.out.println("3.- Retirar");
        	int opcion=read.nextInt();
        	read.nextLine();
        	switch (opcion) {
    		case 1:
    			System.out.println("Nombre del cliente");
    			String nombre = read.nextLine();
    			System.out.println("Apellido del cliente");
    			String apellido = read.nextLine();
    			System.out.println("1  Cuenta de Ahorro");
    			System.out.println("2 Cuenta de Cheques");
    			System.out.println("tipo de cuenta: ");
    			int tc = read.nextInt();
    			read.nextLine();
    			
    			ClienteDao clienteDao = (ClienteDao) context.getBean(ClienteImpl.class);
    			
    			
    			
    			Cliente cliente = new Cliente();
    	        cliente.setNombre(nombre);
    	        cliente.setApellido(apellido);
    	        clienteDao.addCliente(cliente);
    	        
    	        CuentaDao cuentaDao = (CuentaDao) context.getBean(CuentaImpl.class);
    	        
    	        Cuenta cuenta = new Cuenta();
    		    cuenta.setBalance(0);
    		    cuenta.setTipocuenta(tc);
    		    cuenta.setCliente(cliente);
    		    cuentaDao.addCuenta(cuenta);
    		  
    		   
    			
    			break;
    			
    			case 2:
    				System.out.println("numero de cliente: ");
    				int idc =read.nextInt();
    				read.nextLine();
    				
    				ClienteDao clienteDaodep = (ClienteDao) context.getBean(ClienteImpl.class);
    				CuentaDao cuentaDaodep = (CuentaDao) context.getBean(CuentaImpl.class);
    				Cliente cl = clienteDaodep.findCliente(idc);
    				Cuenta c = cuentaDaodep.findCuenta(cl);
    				System.out.println("Saldo: " +c.getBalance());
    				System.out.println("Cantidad a Depositar");
    				double can = read.nextDouble();
    				cuentaDaodep.Deposito(c, can);
    				System.out.println("Slado actual: " + c.getBalance());
    				
    				break;
//    			case 3:
//    				System.out.println("numero de cliente: ");
//    				int idcret =read.nextInt();
//    				read.nextLine();
//    				
//    				ClienteDao clienteDaoret = (ClienteDao) context.getBean(ClienteImpl.class);
//    				CuentaDao cuentaDaoret = (CuentaDao) context.getBean(CuentaImpl.class);
//    				Cliente clret = clienteDaoret.findCliente(idcret);
//    				Cuenta cret = cuentaDaoret.findCuenta(clret);
//    				System.out.println("Saldo: " +cret.getBalance());
//    				System.out.println("Cantidad a Retirar");
//    				double canret = read.nextDouble();
//    				FactoryDao cuentaFactor = (FactoryDao) context.getBean(CuentaFactory.class);
//    				if(cuentaFactor.Retiro(cret, canret)!=false){
//    					System.out.println("Slado actual: " + cret.getBalance());
//    				}else {
//						System.out.println("Error en la transaccion no cuenta con saldo suficiente");
//					}
//    				
//    				break;

    		default:
    			break;
    		}
			
		}
    	
    	

    }
}
