package com.beeva.app.Banco;

import java.util.Scanner;

import com.beeva.app.App.Calculadora;
import com.beeva.app.Banco.Banco;
import com.beeva.app.Banco.Cliente;
import com.beeva.app.Banco.Cuenta;

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
		Calculadora calc = new Calculadora();
		System.out.println("-----------------------------------");
		String calculo =calc.division(0,0);
		System.out.println(calculo);
		System.out.println("-----------------------------------");
		
		for (int i = 0; i <10; i++) {
			Cliente c = new Cliente();
			Cuenta cu = new Cuenta();
			System.out.println("Ingrese el nombre del dueño de la cuenta: ");
			c.setNombre(read.nextLine());
			System.out.println("Ingrese su apellido");
			c.setApellido(read.nextLine());
			c.setCuenta(cu);
			b1.addCliente(c);
		}
		
		for (int i = 0; i < b1.getNCliente(); i++) {
			
			System.out.println(b1.getCliente(i).getNombre()+" "+b1.getCliente(i).getApellido());
		}
		
		System.out.println("Ingrese su numero de cliente: ");
		int nc=read.nextInt();
		b1.getCliente(nc);
		read.nextLine();
		System.out.println(b1.getCliente(nc).getNombre()+" "+b1.getCliente(nc).getApellido());
		
		while (true) {
			System.out.println("1 Balance");
			System.out.println("2 Deposito");
			System.out.println("3 Retiro");
			int opcion = read.nextInt();
			read.nextLine();
			switch (opcion) {
				case 1:
					System.out.println("Su saldo es: $" +b1.getCliente(nc).getCuenta().getBalance());
				break;
				case 2:
					System.out.println("Ingrese la cantidad a depositar: ");
					double can = read.nextDouble();
					b1.getCliente(nc).getCuenta().Deposito(can);
					System.out.println("Su saldo es: $"+b1.getCliente(nc).getCuenta().getBalance());
					read.nextLine();
				break;
				case 3:
					System.out.println(b1.getCliente(nc).getNombre()+" "+b1.getCliente(nc).getApellido());
					System.out.println("Ingrese la cantidad a retirar: ");
					double ret = read.nextDouble();
					double saldo=b1.getCliente(nc).getCuenta().getBalance();
					if(ret<saldo){
						b1.getCliente(nc).getCuenta().Retiro(ret);
						System.out.println("Su saldo es: $"+b1.getCliente(nc).getCuenta().getBalance());
						read.nextLine();
					}else{
					System.out.println("Saldo insuficiente");
					}
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}
		
		
    }
}
