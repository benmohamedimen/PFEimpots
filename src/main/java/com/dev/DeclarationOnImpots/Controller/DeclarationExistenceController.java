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

import com.dev.DeclarationOnImpots.Entity.DeclarationExistence;

import com.dev.DeclarationOnImpots.Service.DeclarationExistenceService;


@RestController
@CrossOrigin
public class DeclarationExistenceController {
	@Autowired 
	private DeclarationExistenceService decService;
	
	@RequestMapping(value = "/declarationExistences", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<DeclarationExistence> getAllDeclarationExistences() {
		return this.decService.findAll();
	}


	@RequestMapping(value = "/declarationExistences/{CodeDE}", method = RequestMethod.GET, headers = "Accept=application/json")
	public DeclarationExistence findOne(@PathVariable Long CodeDE,@RequestBody DeclarationExistence l) {
		return this.decService.findOne(CodeDE);
	}
	@RequestMapping(value = "/declarationExistences/addDeclarationExistence", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<DeclarationExistence> addDeclarationExistence(@RequestBody DeclarationExistence l ) {

		this.decService.add(l);

		return this.decService.findAll();
	}

	@RequestMapping (value="/declarationExistences/{CodeDE}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public DeclarationExistence update(@PathVariable Long CodeDE,@RequestBody DeclarationExistence l) {
		l.setCodeDE(CodeDE);
		return this.decService.update(l);
	}
	@RequestMapping (value="/declarationExistences/{CodeDE}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long CodeDE) {
		decService.supprimer(CodeDE);
		return true;
	}

}
