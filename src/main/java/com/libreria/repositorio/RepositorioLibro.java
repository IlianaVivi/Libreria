package com.libreria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.entidades.Libro;


// es donde hace la jpa una conexion a la bd
@Repository
public interface RepositorioLibro extends JpaRepository<Libro,Integer> {

}
