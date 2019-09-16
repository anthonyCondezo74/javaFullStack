package com.bn.pe.demobn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bn.pe.demobn.model.BCanal;
import com.bn.pe.demobn.service.CanalServiceImpl;

@RestController
public class CanalController {

	@Autowired
	private CanalServiceImpl serviceCanal;
	
	@GetMapping
	private void registrarCanal() {
	BCanal canal = new BCanal();
	canal.setId("1");
	canal.setNombre("MOVIL");
	canal.setEstado("A");

	serviceCanal.registrar(canal);	
	}
}
