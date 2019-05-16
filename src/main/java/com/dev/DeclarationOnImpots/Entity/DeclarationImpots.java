package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class DeclarationImpots implements Serializable {
 @Id Long IdDeclarationImpots ; 
 String TypeDeclarationImpots;
 String Obligation;
 Date DateDeclarationImpots;
 @OneToMany(mappedBy="CodeEx")


public String getTypeDeclarationImpots() {
	return this.TypeDeclarationImpots;
}
public Long getIdDeclarationImpots() {
	return this.IdDeclarationImpots;
}
public void setIdDeclarationImpots(Long idDeclarationImpots) {
	IdDeclarationImpots = idDeclarationImpots;
}
public void setTypeDeclarationImpots(String typeDeclarationImpots) {
	TypeDeclarationImpots = typeDeclarationImpots;
}
public String getObligation() {
	return this.Obligation;
}
public void setObligation(String obligation) {
	Obligation = obligation;
}
public Date getDateDeclarationImpots() {
	return this.DateDeclarationImpots;
}
public void setDateDeclarationImpots(Date dateDeclarationImpots) {
	DateDeclarationImpots = dateDeclarationImpots;
}
public DeclarationImpots() {
	super();
	// TODO Auto-generated constructor stub
}
public DeclarationImpots(Long idDeclarationImpots, String typeDeclarationImpots, String obligation,
		Date dateDeclarationImpots) {
	super();
	IdDeclarationImpots = idDeclarationImpots;
	TypeDeclarationImpots = typeDeclarationImpots;
	Obligation = obligation;
	DateDeclarationImpots = dateDeclarationImpots;
}

 
}