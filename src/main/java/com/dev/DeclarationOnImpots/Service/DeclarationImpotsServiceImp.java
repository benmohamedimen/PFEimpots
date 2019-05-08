package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;
import com.dev.DeclarationOnImpots.Entity.Employee;
import com.dev.DeclarationOnImpots.Repository.DeclarationImpotsRepository;

@Service
public class DeclarationImpotsServiceImp implements DeclarationImpotsService {
	@Autowired 
	private DeclarationImpotsRepository decRepository;

	@Override
	public void add(DeclarationImpots dec) {
		this.decRepository.save(dec);
		
	}

	@Override
	public DeclarationImpots update(DeclarationImpots dec) {
	
		return this.decRepository.save(dec);
	}

	@Override
	public List<DeclarationImpots> findAll() {
		
		return (List<DeclarationImpots>) this.decRepository.findAll();
	}

	@Override
	public DeclarationImpots findOne(Long IdDeclarationImpots) {
		
		return this.decRepository.findOne(IdDeclarationImpots);
	}

	@Override
	public boolean supprimer(Long IdDeclarationImpots) {
	  decRepository.deleteById(IdDeclarationImpots);
		return true;
	}
	
}
