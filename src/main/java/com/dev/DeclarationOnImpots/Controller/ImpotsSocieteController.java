package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;

import com.dev.DeclarationOnImpots.Service.ImpotsSocieteService;

@RestController
@CrossOrigin 
public class ImpotsSocieteController {
	@Autowired
	private ImpotsSocieteService impotsSocieteService;
	@RequestMapping(value = "/impotsSocietes", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<ImpotsSociete> getAllImpotsSocietes() {
		return this.impotsSocieteService.findAll();
	}
	@RequestMapping(value = "/impotsSocietes/{ImpotsSocieteId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ImpotsSociete findOne(@PathVariable Long ImpotsSocieteId,@RequestBody ImpotsSociete l) {
		return this.impotsSocieteService.findOne(ImpotsSocieteId);
	}
	@RequestMapping(value = "/impotsSocietes/addImpotsSociete", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<ImpotsSociete> addImpotsSociete(@RequestBody ImpotsSociete l ) {
		
		

		this.impotsSocieteService.add(l);

		return this.impotsSocieteService.findAll();
	}
	
	@RequestMapping (value="/impotsSocietes/{ImpotsSocieteId}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public ImpotsSociete update(@PathVariable Long ImpotsSocieteId,@RequestBody ImpotsSociete l) {
		l.setImpotsSocieteId(ImpotsSocieteId);
		return this.impotsSocieteService.update(l);
	}
	@RequestMapping (value="/impotsSocietes/{ImpotsSocieteId}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long ImpotsSocieteId) {
		impotsSocieteService.supprimer(ImpotsSocieteId);
		return true;
	}
	
	
	
}
