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

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;
import com.dev.DeclarationOnImpots.Service.PersonneMorlService;

@RestController
@CrossOrigin
public class PersonneMorlController {
	
	@Autowired
	private PersonneMorlService personneMorlService;
	
	
	@RequestMapping(value = "/personneMorls", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<PersonneMorl> getAllPersonneMorls() {
		return this.personneMorlService.findAll();
	}
	@RequestMapping(value = "/personneMorls/{RegistreCommerce}", method = RequestMethod.GET, headers = "Accept=application/json")
	public PersonneMorl findOne(@PathVariable Long RegistreCommerce,@RequestBody PersonneMorl pm) {
		return this.personneMorlService.findOne(RegistreCommerce);
	}
	@RequestMapping(value = "/personneMorls/addPersonneMorl", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<PersonneMorl> addPersonneMorl(@RequestBody PersonneMorl pm ) {
		
		

		this.personneMorlService.add(pm);

		return this.personneMorlService.findAll();
	}
	
	@RequestMapping (value="/personneMorls/{RegistreCommerce}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public PersonneMorl update(@PathVariable Long RegistreCommerce,@RequestBody PersonneMorl pm) {
		pm.setRegistreCommerce(RegistreCommerce);
		return this.personneMorlService.update(pm);
	}
	@RequestMapping (value="/personneMorls/{RegistreCommerce}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long RegistreCommerce) {
		personneMorlService.supprimer(RegistreCommerce);
		return true;
	}

}
