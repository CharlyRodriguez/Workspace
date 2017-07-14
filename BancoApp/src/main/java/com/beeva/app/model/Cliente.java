package com.beeva.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcliente")
	private int id;
	@Column(name="nombre")
	private String Nombre;
	@Column(name="apellido")
	private String Apellido;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable( name="bancosclientes", joinColumns={@JoinColumn(name="idcliente")}, 
									 inverseJoinColumns={@JoinColumn(name="idbanco")})
	private Set<Banco> bancos=new HashSet<Banco>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cliente")
	private Set<Cuenta> cuentas=new HashSet<Cuenta>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Set<Banco> getBancos() {
		return bancos;
	}
	public void setBancos(Set<Banco> bancos) {
		this.bancos = bancos;
	}
	public Set<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	

}
