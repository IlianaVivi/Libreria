package com.libreria.controller;
//El controller solo es para navegar con diferentes vista, en este caso tenemos libros
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.libreria.entidades.Libro;

@Controller
public class ControllerLibro {
	@GetMapping("/getlibros")
	public String getlibros() {
		
		return "libros";
	}
	
	@GetMapping("/")
	public String inicio() {
		
		 return "index";
	}
	
	@GetMapping("/libros")
	public String libros() {
		
		 return "libros";
	}
	
	
	@GetMapping("/nuevo")
	public String nuevo() {
		
		 return "nuevo";
	}
	
	@GetMapping("/borrado")
	public String borrado() {
		
		 return "borrado";
	}

   
}

