package com.nutrition.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.nutrition.datasource.models.Nutricionista;
import com.nutrition.repository.NutricionistaRepository;

public class CadastroNutricionista {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	public void cadastro(Nutricionista nutricionista) {
		nutricionistaRepository.saveAndFlush(nutricionista);
	}
}
