package com.beeva.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcuenta")
	private int id;
	@Column(name="balance")
	private double balance;
	@Column(name="idtipocuenta")
	private int tipocuenta; 	
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getTipocuenta() {
		return tipocuenta;
	}

	public void setTipocuenta(int tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

		
	
	

}
