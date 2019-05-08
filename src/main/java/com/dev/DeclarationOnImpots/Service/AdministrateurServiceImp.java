package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.Administrateur;
import com.dev.DeclarationOnImpots.Repository.AdministrateurRepository;

@Service 
public class AdministrateurServiceImp implements AdministrateurService {
@Autowired 
private AdministrateurRepository adminRepository;
	@Override
	public void add(Administrateur admin) {
		this.adminRepository.save(admin);
		
	}

	@Override
	public Administrateur update(Administrateur admin) {
		
		return this.adminRepository.save(admin);
	}

	@Override
	public List<Administrateur> findAll() {
		
		return (List<Administrateur>) this.adminRepository.findAll();
	}

	@Override
	public Administrateur findOne(Long CodeAdmin) {
		
		return this.adminRepository.findOne(CodeAdmin);
	}

	@Override
	public boolean supprimer(Long CodeAdmin) {
		adminRepository.deleteById(CodeAdmin);
		return true;
	}

}
