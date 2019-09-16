package com.bn.pe.demobn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bn.pe.demobn.model.BCanal;
import com.bn.pe.demobn.repo.ICanalRepo;

@Service
public class CanalServiceImpl implements ICanalService{

	@Autowired
	private ICanalRepo canalRepo;
	
	@Override
	public void registrar(BCanal canal) {
		// TODO Auto-generated method stub
		canalRepo.registrar(canal);
	}

}
