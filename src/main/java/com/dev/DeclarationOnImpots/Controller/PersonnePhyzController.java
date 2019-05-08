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

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;
import com.dev.DeclarationOnImpots.Service.PersonnePhyzService;


@RestController
@CrossOrigin
public class PersonnePhyzController {
	@Autowired
	private PersonnePhyzService personnePhyzService;
	
	
	@RequestMapping(value = "/personnePhyzs", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<PersonnePhyz> getAllPersonnePhyzs() {
		return this.personnePhyzService.findAll();
	}
	@RequestMapping(value = "/personnePhyzs/{Cin}", method = RequestMethod.GET, headers = "Accept=application/json")
	public PersonnePhyz findOne(@PathVariable Long Cin,@RequestBody PersonnePhyz pp) {
		return this.personnePhyzService.findOne(Cin);
	}
	@RequestMapping(value = "/personnePhyzs/addPersonnePhyz", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<PersonnePhyz> addPersonnePhyz(@RequestBody PersonnePhyz pp ) {
		
		

		this.personnePhyzService.add(pp);

		return this.personnePhyzService.findAll();
	}
	
	@RequestMapping (value="/personnePhyzs/{Cin}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public PersonnePhyz update(@PathVariable Long Cin,@RequestBody PersonnePhyz pp) {
		pp.setCin(Cin);
		return this.personnePhyzService.update(pp);
	}
	@RequestMapping (value="/personnePhyzs/{Cin}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long Cin) {
		personnePhyzService.supprimer(Cin);
		return true;
	}
}
