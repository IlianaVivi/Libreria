package com.libreria.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.libreria.entidades.Libro;
//Nos sirve para meter las interfaces de vert todos los libros o agregar libros
@Service
public interface ServiciosLibro {
	public List<Libro>getTodosloslibros();
	public void agregarLibro(Libro libro);
	public void borrarLibro(Integer id);

}



