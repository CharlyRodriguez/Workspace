package com.beeva.app.BancoDao;

import java.util.Scanner;

import com.beeva.app.implementaciones.CuentaFactory;
import com.beeva.app.interfaces.CuentaDao;
import com.beeva.app.model.Banco;
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
    	Scanner read = new Scanner(System.in);
		Banco b1 = new Banco();
		for (int i = 0; i <10; i++) {
			Cliente c = new Cliente();
			System.out.println("Ingrese el nombre del dueño de la cuenta: ");
			c.setNombre(read.nextLine());
			System.out.println("Ingrese su apellido");
			c.setApellido(read.nextLine());
			System.out.println("Ingrese 1 para cuenta de ahorro o 2 para cuenta de cheques: ");
			Cuenta cu = new Cuenta();
			cu.setTipoCuenta(read.nextInt());
			c.setCuenta(cu);
			b1.addCliente(c);
			read.nextLine();
			
		}
		
		for (int i = 0; i < b1.getNCliente(); i++) {
			
			System.out.println(b1.getCliente(i).getNombre()+" "+b1.getCliente(i).getApellido());
		}
		
		
		int p=0;
		
		while (p!=4) {
			System.out.println("Ingrese su numero de cliente: ");
			int nc=read.nextInt();
			CuentaFactory tc = new CuentaFactory();
			CuentaDao f= tc.getImplement(b1.getCliente(nc).getCuenta());
			read.nextLine();
			System.out.println(b1.getCliente(nc).getNombre()+" "+b1.getCliente(nc).getApellido()+" "+b1.getCliente(nc).getCuenta().getTipoCuenta());
			System.out.println("1 Balance");
			System.out.println("2 Deposito");
			System.out.println("3 Retiro");
			System.out.println("4 salir");
			int opcion = read.nextInt();
			read.nextLine();
			switch (opcion) {
				case 1:
					System.out.println("Su saldo es: $" +b1.getCliente(nc).getCuenta().getBalance());
				break;
				case 2:
					System.out.println("Ingrese la cantidad a depositar: ");
					double can = read.nextDouble();
					f.Deposito(b1.getCliente(nc), can);
					System.out.println("Su saldo es: $"+b1.getCliente(nc).getCuenta().getBalance());
					read.nextLine();
				break;
				case 3:
					System.out.println(b1.getCliente(nc).getNombre()+" "+b1.getCliente(nc).getApellido());
					System.out.println("Ingrese la cantidad a retirar: ");
					double ret = read.nextDouble();
					double saldo=b1.getCliente(nc).getCuenta().getBalance();
						f.Retiro(b1.getCliente(nc), ret);
						System.out.println("Su saldo es: $"+b1.getCliente(nc).getCuenta().getBalance());
						read.nextLine();
				break;
				case 4:
					p = 4;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}
		
    }
}
