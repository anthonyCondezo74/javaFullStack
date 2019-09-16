package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	@Override
	public void registrar(Persona per) {
		// TODO Auto-generated method stub
		System.out.println("se registro"+ per.apellido +" "+ per.apellido );
	}

}
