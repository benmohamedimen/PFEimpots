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

import com.dev.DeclarationOnImpots.Entity.Administrateur;

import com.dev.DeclarationOnImpots.Service.AdministrateurService;

@RestController
@CrossOrigin
public class AdministrateurController {
@Autowired 
private AdministrateurService adminService;

@RequestMapping(value = "/administrateurs", method = RequestMethod.GET, headers = "Accept=application/json")
public @ResponseBody List<Administrateur> getAllAdministrateurs() {
	return this.adminService.findAll();
}
@RequestMapping(value = "/administrateurs/{CodeAdmin}", method = RequestMethod.GET, headers = "Accept=application/json")
public Administrateur findOne(@PathVariable Long CodeAdmin,@RequestBody Administrateur l) {
	return this.adminService.findOne(CodeAdmin);
}
@RequestMapping(value = "/administrateurs/addAdministrateur", method = RequestMethod.POST, headers = "Accept=application/json")
public List<Administrateur> addAdministrateur(@RequestBody Administrateur l ) {
	this.adminService.add(l);
	return this.adminService.findAll();
}

@RequestMapping (value="/administrateurs/{CodeAdmin}",method=RequestMethod.PUT, headers = "Accept=application/json")
public Administrateur update(@PathVariable Long CodeAdmin,@RequestBody Administrateur l) {
	l.setCodeAdmin(CodeAdmin);
	return this.adminService.update(l);
}
@RequestMapping (value="/administrateurs/{CodeAdmin}",method=RequestMethod.DELETE)
public boolean supmrimer(@PathVariable Long CodeAdmin) {
	adminService.supprimer(CodeAdmin);
	return true;
}



}
