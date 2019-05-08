package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;
import com.dev.DeclarationOnImpots.Repository.PersonnePhyzRepository;

@Service
public class PersonnePhyzServiceImp implements PersonnePhyzService {
	@Autowired
	private PersonnePhyzRepository personnePhyzRepository;

	@Override
	public void add(PersonnePhyz personnePhyz) {
		 this.personnePhyzRepository.save(personnePhyz);
		
	}

	@Override
	public PersonnePhyz update(PersonnePhyz personnePhyz) {
		return this.personnePhyzRepository.save(personnePhyz);
	}

	@Override
	public List<PersonnePhyz> findAll() {
		return (List<PersonnePhyz>) this.personnePhyzRepository.findAll();
	}

	@Override
	public PersonnePhyz findOne(Long Cin) {
		return this.personnePhyzRepository.findOne(Cin);
	}

	@Override
	public boolean supprimer(Long Cin) {
		personnePhyzRepository.deleteById(Cin);
		return true;
	}
	

}
