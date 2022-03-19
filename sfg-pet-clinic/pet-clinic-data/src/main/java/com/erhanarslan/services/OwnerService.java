package com.erhanarslan.services;

import java.util.Set;

import com.erhanarslan.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
