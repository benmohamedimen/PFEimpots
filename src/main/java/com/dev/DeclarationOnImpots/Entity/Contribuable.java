package com.dev.DeclarationOnImpots.Entity;



import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
@Entity 

//@Inheritance(strategy=InheritanceType.table_per_class)
public class Contribuable implements Serializable, UserDetails {
 

@Id	private long NIF;
 private String login;
 private String password;
 private Date dateNaissance;
 private String email;
 private Long tel;
public enum  categorie {personnePhysique, personneMorale};
private int NumCnss;
private String Nationnalite;
private String Adresse;
public String Status;



 

@Override
public boolean isAccountNonExpired() {
    return false;
}
@Override
public boolean isAccountNonLocked() {
    return false;
}
@Override
public boolean isCredentialsNonExpired() {
    return false;
}
@Override
public boolean isEnabled() {
    return false;
}
@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
}
@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return null;
}
public long getNIF() {
	return NIF;
}
public void setNIF(long nIF) {
	NIF = nIF;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getTel() {
	return tel;
}
public void setTel(Long tel) {
	this.tel = tel;
}
public int getNumCnss() {
	return NumCnss;
}
public void setNumCnss(int numCnss) {
	NumCnss = numCnss;
}
public String getNationnalite() {
	return Nationnalite;
}
public void setNationnalite(String nationnalite) {
	Nationnalite = nationnalite;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public void setPassword(String password) {
	this.password = password;
}
public Contribuable() {
	super();
	// TODO Auto-generated constructor stub
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public Contribuable(long nIF, String login, String password, Date dateNaissance, String email, Long tel, int numCnss,
		String nationnalite, String adresse, String status) {
	super();
	NIF = nIF;
	this.login = login;
	this.password = password;
	this.dateNaissance = dateNaissance;
	this.email = email;
	this.tel = tel;
	NumCnss = numCnss;
	Nationnalite = nationnalite;
	Adresse = adresse;
	Status = status;
}


}
