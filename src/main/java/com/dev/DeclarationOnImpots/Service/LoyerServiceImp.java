package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.Loyer;
import com.dev.DeclarationOnImpots.Repository.LoyerRepository;

@Service
public class LoyerServiceImp implements LoyerService {
	@Autowired
	private LoyerRepository loyerRepository;
	@Override
	public void add(Loyer loyer) {
		this.loyerRepository.save(loyer);
		
	}

	@Override
	public Loyer update(Loyer loyer) {
		return this.loyerRepository.save(loyer);
	}

	@Override
	public List<Loyer> findAll() {
		return (List<Loyer>) this.loyerRepository.findAll();
	}

	@Override
	public Loyer findOne(Long NumLoyer) {
		return this.loyerRepository.findOne(NumLoyer);
	}

	@Override
	public boolean supprimer(Long NumLoyer) {
		loyerRepository.deleteById(NumLoyer);
		return true;
	}

}
