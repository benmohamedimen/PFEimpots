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

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;

import com.dev.DeclarationOnImpots.Service.DeclarationImpotsService;

@RestController
@CrossOrigin
public class DeclarationImpotsController {
@Autowired 
private DeclarationImpotsService decService;
@RequestMapping(value = "/declarationImpotss", method = RequestMethod.GET, headers = "Accept=application/json")
public @ResponseBody List<DeclarationImpots> getAllDeclarationImpotss() {
	return this.decService.findAll();
}


@RequestMapping(value = "/declarationImpotss/{IdDeclarationImpots}", method = RequestMethod.GET, headers = "Accept=application/json")
public DeclarationImpots findOne(@PathVariable Long IdDeclarationImpots,@RequestBody DeclarationImpots l) {
	return this.decService.findOne(IdDeclarationImpots);
}
@RequestMapping(value = "/declarationImpotss/addDeclarationImpots", method = RequestMethod.POST, headers = "Accept=application/json")
public List<DeclarationImpots> addDeclarationImpots(@RequestBody DeclarationImpots l ) {
	
	

	this.decService.add(l);

	return this.decService.findAll();
}

@RequestMapping (value="/declarationImpotss/{IdDeclarationImpots}",method=RequestMethod.PUT, headers = "Accept=application/json")
public DeclarationImpots update(@PathVariable Long IdDeclarationImpots,@RequestBody DeclarationImpots l) {
	l.setIdDeclarationImpots(IdDeclarationImpots);
	return this.decService.update(l);
}
@RequestMapping (value="/declarationImpotss/{IdDeclarationImpots}",method=RequestMethod.DELETE)
public boolean supmrimer(@PathVariable Long IdDeclarationImpots) {
	decService.supprimer(IdDeclarationImpots);
	return true;
}

}
