package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;


public interface PersonneMorlService {
	void add(PersonneMorl personneMorl);
	PersonneMorl update(PersonneMorl personneMorl);
	List<PersonneMorl> findAll();
	PersonneMorl findOne(Long RegistreCommerce);
	public boolean supprimer(Long RegistreCommerce);

}
