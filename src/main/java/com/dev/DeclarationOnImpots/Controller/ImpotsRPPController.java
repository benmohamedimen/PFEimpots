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

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;
import com.dev.DeclarationOnImpots.Service.ImpotsRPPService;


@RestController
@CrossOrigin 
public class ImpotsRPPController {
	@Autowired
	private ImpotsRPPService impotsRPPService;
	@RequestMapping(value = "/impotsRPPs", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<ImpotsRPP> getAllImpotsRPPs() {
		return this.impotsRPPService.findAll();
	}
	@RequestMapping(value = "/impotsRPPs/{ImpotsRPPId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ImpotsRPP findOne(@PathVariable Long ImpotsRPPId,@RequestBody ImpotsRPP l) {
		return this.impotsRPPService.findOne(ImpotsRPPId);
	}
	@RequestMapping(value = "/impotsRPPs/addImpotsRPP", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<ImpotsRPP> addImpotsRPP(@RequestBody ImpotsRPP l ) {
		
		

		this.impotsRPPService.add(l);

		return this.impotsRPPService.findAll();
	}
	
	@RequestMapping (value="/impotsRPPs/{ImpotsRPPId}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public ImpotsRPP update(@PathVariable Long ImpotsRPPId,@RequestBody ImpotsRPP l) {
		l.setImpotsRPPId(ImpotsRPPId);
		return this.impotsRPPService.update(l);
	}
	@RequestMapping (value="/impotsRPPs/{ImpotsRPPId}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long ImpotsRPPId) {
		impotsRPPService.supprimer(ImpotsRPPId);
		return true;
	}
	
	
	
}
