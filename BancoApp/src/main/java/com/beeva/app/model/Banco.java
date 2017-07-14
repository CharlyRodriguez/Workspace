package com.beeva.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="banco")
public class Banco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idbanco")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@ManyToMany(mappedBy="bancos")
	private Set<Cliente> clientes=new HashSet<Cliente>();

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
