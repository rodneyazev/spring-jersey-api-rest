package com.spring.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESAS")
public class Empresa {
	
private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String name;
	private String endereco;
	
	public Empresa() {	}
	
	public Empresa(int id, String name, String endereco) {
		super();
		this.id = id;
		this.name = name;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}		
	
}
