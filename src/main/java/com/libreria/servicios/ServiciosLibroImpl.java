package com.libreria.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entidades.Libro;
import com.libreria.repositorio.RepositorioLibro;

@Service
public class ServiciosLibroImpl implements ServiciosLibro{
	//implementamos dependencia del repositorio libro 

@Autowired 
private RepositorioLibro repositoriolibro;

@Override
public List<Libro> getTodosloslibros() {
	// TODO Auto-generated method stub
	return repositoriolibro.findAll();
}

@Override
public void agregarLibro(Libro libro) {
	// TODO Auto-generated method stub
	repositoriolibro.save(libro);
	
}

@Override
public void borrarLibro(Integer id) {
	repositoriolibro.deleteById(id);
	
}



}
