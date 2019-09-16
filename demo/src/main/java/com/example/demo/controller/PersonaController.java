package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
import com.example.demo.service.PersonaServiceImpl;

@RestController
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public void registrar() {
		Persona per = new Persona();
		per.setNombre("KENYI");
		per.setApellido("CONDEZO");
		
		
		service = new PersonaServiceImpl();
		service.registrar(per);
	}
	
}
