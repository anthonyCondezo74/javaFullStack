package com.bn.pe.demobn.repo;

import org.springframework.stereotype.Repository;

import com.bn.pe.demobn.model.BCanal;

@Repository
public class CanalRepoImpl  implements ICanalRepo{

	@Override
	public void registrar(BCanal canal) {
	 System.out.println("Se registro el siguiente canal" + canal.getId() + "" + canal.getNombre() + "" );
		
	}


	
}
