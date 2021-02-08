package com.libreria.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="libros") //ENTIDAD 
public class Libro {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto incremento
	private Integer id;
	
	@Column(name="nombre",nullable=false, length=30)
	private String nombre;

	@Column(name="autor",nullable=false, length=30)
	private String autor;

	@Column(name="tema",nullable=false, length=30)/// si es cientifico,matematico,ect
	private String tema;

	@Column(name="anio_impresion",nullable=false, length=5)
	private String anio;
	
	@Column(name="numero_paginas",nullable=false, length=30)
	private String pagina;
	
	@Column(name="descripcion",nullable=false, length=30)
	private String des;
	
	
	public Libro() {
		
	
	}
	
	public Libro(String nombre, String autor, String tema, String anio, String pagina, String des) {
		
		this.nombre = nombre;
		this.autor = autor;
		this.tema = tema;
		this.anio = anio;
		this.pagina = pagina;
		this.des = des;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}





}
