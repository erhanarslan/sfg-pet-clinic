package com.erhanarslan.services;

import java.util.Set;

import com.erhanarslan.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
