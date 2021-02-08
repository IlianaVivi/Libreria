package com.libreria.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.libreria.controller.ControllerLibro;

import java.net.URI;

import com.libreria.entidades.Libro;
import com.libreria.servicios.ServiciosLibroImpl;
// el conexión con los json 
@RestController
@RequestMapping (value ={"/api/libreria"})
public class ControllerLibroRest{
	// vamos hacer una dependencia con servicios libro implementación 
	@Autowired
	private ServiciosLibroImpl servicioLibroImpl;
//hacemos la peticion get jala de json
	@GetMapping("/getlibros")
	public List<Libro> getlibros() {
		return servicioLibroImpl.getTodosloslibros();
	}
	
	//hacemos la peticion post para el formulario tabla
	@PostMapping("/postlibros")
	public void postLibros (@ModelAttribute(value="nombre") String nombre,
			@ModelAttribute(value="autor") String autor,
			@ModelAttribute(value="tema") String tema,
			@ModelAttribute(value="anio_impresion") String anio,
			@ModelAttribute(value="numero_paginas") String pagina,
			@ModelAttribute(value="descripcion") String des) { 	
		Libro libro= new Libro(nombre,autor, tema, anio,pagina,des);
		servicioLibroImpl.agregarLibro(libro);
		//return "Se ha registrado el libro";
	}
	
	@PostMapping("/borrarLibro")
	public void borrarLibro (@ModelAttribute(value="id") Integer id) { 
		servicioLibroImpl.borrarLibro(id);
	}	
}
