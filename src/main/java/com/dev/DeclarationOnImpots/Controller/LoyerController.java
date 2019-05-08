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

import com.dev.DeclarationOnImpots.Entity.Loyer;

import com.dev.DeclarationOnImpots.Service.LoyerService;

@RestController
@CrossOrigin 
public class LoyerController {
	@Autowired
	private LoyerService loyerService;
	@RequestMapping(value = "/loyers", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Loyer> getAllLoyers() {
		return this.loyerService.findAll();
	}
	@RequestMapping(value = "/loyers/{NumLoyer}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Loyer findOne(@PathVariable Long NumLoyer,@RequestBody Loyer l) {
		return this.loyerService.findOne(NumLoyer);
	}
	@RequestMapping(value = "/loyers/addLoyer", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Loyer> addLoyer(@RequestBody Loyer l ) {
		
		

		this.loyerService.add(l);

		return this.loyerService.findAll();
	}
	
	@RequestMapping (value="/loyers/{NumLoyer}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public Loyer update(@PathVariable Long NumLoyer,@RequestBody Loyer l) {
		l.setNumLoyer(NumLoyer);
		return this.loyerService.update(l);
	}
	@RequestMapping (value="/loyers/{NumLoyer}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long NumLoyer) {
		loyerService.supprimer(NumLoyer);
		return true;
	}
}
