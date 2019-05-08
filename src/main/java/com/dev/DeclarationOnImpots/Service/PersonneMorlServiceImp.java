package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;
import com.dev.DeclarationOnImpots.Repository.PersonneMorlRepository;


@Service
public class PersonneMorlServiceImp implements PersonneMorlService  {
	@Autowired
	private PersonneMorlRepository personneMorlRepository;
	@Override
	public void add(PersonneMorl personneMorl) {
		this.personneMorlRepository.save(personneMorl);
		
	}

	@Override
	public PersonneMorl update(PersonneMorl personneMorl) {
		return this.personneMorlRepository.save(personneMorl);
	}

	@Override
	public List<PersonneMorl> findAll() {
		return (List<PersonneMorl>) this.personneMorlRepository.findAll();
	}

	@Override
	public PersonneMorl findOne(Long RegistreCommerce) {
		return this.personneMorlRepository.findOne(RegistreCommerce);
	}

	@Override
	public boolean supprimer(Long RegistreCommerce) {
		personneMorlRepository.deleteById(RegistreCommerce);
		return true;
	}

}
