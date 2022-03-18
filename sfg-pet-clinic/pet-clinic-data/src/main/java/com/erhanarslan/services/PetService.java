package com.erhanarslan.services;

import java.util.Set;

import com.erhanarslan.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
