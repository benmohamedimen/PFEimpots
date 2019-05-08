package com.dev.DeclarationOnImpots.Entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Exercice /*extends DeclarationImpots */implements Serializable{

	@Id Long CodeEx;
	Date DateOuverture;
	Date DateCloture;
	String CadreLegal;
	public Exercice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exercice(Long codeEx, Date dateOuverture, Date dateCloture, String cadreLegal) {
		super();
		CodeEx = codeEx;
		DateOuverture = dateOuverture;
		DateCloture = dateCloture;
		CadreLegal = cadreLegal;
	}
	public Long getCodeEx() {
		return CodeEx;
	}
	public void setCodeEx(Long codeEx) {
		CodeEx = codeEx;
	}
	public Date getDateOuverture() {
		return DateOuverture;
	}
	public void setDateOuverture(Date dateOuverture) {
		DateOuverture = dateOuverture;
	}
	public Date getDateCloture() {
		return DateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		DateCloture = dateCloture;
	}
	public String getCadreLegal() {
		return CadreLegal;
	}
	public void setCadreLegal(String cadreLegal) {
		CadreLegal = cadreLegal;
	}

	
	
}
