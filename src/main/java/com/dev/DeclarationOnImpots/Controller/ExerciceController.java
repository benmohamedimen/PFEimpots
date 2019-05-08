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

import com.dev.DeclarationOnImpots.Entity.Exercice;

import com.dev.DeclarationOnImpots.Service.ExerciceService;


@RestController
@CrossOrigin

public class ExerciceController {
	@Autowired
	private ExerciceService exerciceService;
	@RequestMapping(value = "/exercices", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Exercice> getAllExercices() {
		return this.exerciceService.findAll();
	}
	
	
	@RequestMapping(value = "/exercices/{CodeEx}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Exercice findOne(@PathVariable Long CodeEx,@RequestBody Exercice l) {
		return this.exerciceService.findOne(CodeEx);
	}
	@RequestMapping(value = "/exercices/addExercice", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Exercice> addExercice(@RequestBody Exercice l ) {
		
		

		this.exerciceService.add(l);

		return this.exerciceService.findAll();
	}
	
	@RequestMapping (value="/exercices/{CodeEx}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public Exercice update(@PathVariable Long CodeEx,@RequestBody Exercice l) {
		l.setCodeEx(CodeEx);
		return this.exerciceService.update(l);
	}
	@RequestMapping (value="/exercices/{CodeEx}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long CodeEx) {
		exerciceService.supprimer(CodeEx);
		return true;
	}

}
