package com.nutrition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.datasource.models.Nutricionista;

public interface NutricionistaRepository 
		extends JpaRepository<Nutricionista, Long>{
	
}
