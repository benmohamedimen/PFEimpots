package com.dev.DeclarationOnImpots.Entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;


@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class PersonnePhyz /*extends Contribuable*/ implements Serializable {

	
	@Id Long Cin;
	String Nom;
	String Prenom;
	Date DateNaissance;
	String Profession;
	String EtatCivil;
	int NbrEnfHandicapeEncharge;
	int NbreAutreEnf;
	public Long getCin() {
		return Cin;
	}
	public void setCin(Long cin) {
		Cin = cin;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getEtatCivil() {
		return EtatCivil;
	}
	public void setEtatCivil(String etatCivil) {
		EtatCivil = etatCivil;
	}
	public int getNbrEnfHandicapeEncharge() {
		return NbrEnfHandicapeEncharge;
	}
	public void setNbrEnfHandicapeEncharge(int nbrEnfHandicapeEncharge) {
		NbrEnfHandicapeEncharge = nbrEnfHandicapeEncharge;
	}
	public int getNbreAutreEnf() {
		return NbreAutreEnf;
	}
	public void setNbreAutreEnf(int nbreAutreEnf) {
		NbreAutreEnf = nbreAutreEnf;
	}
	
	
	public PersonnePhyz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
