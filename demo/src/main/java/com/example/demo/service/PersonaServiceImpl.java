package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repo.IPersonaRepo;
import com.example.demo.repo.PersonaRepoImpl;

@Service
public class PersonaServiceImpl  implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(Persona per) {
		// TODO Auto-generated method stub
		//repo = new PersonaRepoImpl(); esta instancia ya no me sirve por use @Repository y lo obtuve con  @Autowired
		repo.registrar(per);
	}

}
