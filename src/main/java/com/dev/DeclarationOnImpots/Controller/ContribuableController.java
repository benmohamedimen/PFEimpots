package com.dev.DeclarationOnImpots.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Service.ContribuableService;





@RestController
@CrossOrigin 
public class ContribuableController {
	@Autowired
	private ContribuableService contribuableService;
	
	@RequestMapping(value = "/contribuables", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Contribuable> getAllContribuables() {
		return this.contribuableService.findAll();
	}

	

	@RequestMapping(value = "/contribuables/{NIF}/{Status}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public List<Contribuable> changeStatus(@PathVariable long NIF, @PathVariable String Status) {
		this.contribuableService.changeStatus(NIF, Status);
		return this.contribuableService.findAll();
	}

	/*@RequestMapping(value = "/contribuables/{NIF}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public List<Contribuable> update(@PathVariable long NIF) {
		this.contribuableService.update(Contribuable);
		return this.contribuableService.findAll();
	}
	*/
	@RequestMapping (value="/contribuables/{NIF}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public Contribuable update(@PathVariable Long NIF,@RequestBody Contribuable c) {
		c.setNIF(NIF);
		return this.contribuableService.update(c);
	}

	@RequestMapping(value = "/contribuables/addContribuable", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Contribuable> addContribuable(@RequestBody Contribuable c ) {
		
		

		this.contribuableService.add(c);

		return this.contribuableService.findAll();
	}
	@RequestMapping (value="/contribuables/{NIF}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long NIF) {
		contribuableService.supprimer(NIF);
		return true;
	}
	@RequestMapping(value = "/contribuables/{NIF}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Contribuable findOne(@PathVariable Long NIF,@RequestBody Contribuable c) {
		return this.contribuableService.findOne(NIF);
	}
}
