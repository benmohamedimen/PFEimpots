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
 

@Id	private long nif;
 private String login;
 private String password;
 private Date dateNaissance;
 private String email;
 private Long tel;
public enum  categorie {personnePhysique, personneMorale};
private int numCnss;
private String nationnalite;
private String adresse;
public String status;



 

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
public long getNif() {
	return nif;
}
public void setNif(long nif) {
	this.nif = nif;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
	return numCnss;
}
public void setNumCnss(int numCnss) {
	this.numCnss = numCnss;
}
public String getNationnalite() {
	return nationnalite;
}
public void setNationnalite(String nationnalite) {
	this.nationnalite = nationnalite;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Contribuable() {
	super();
	// TODO Auto-generated constructor stub
}
public Contribuable(long nif, String login, String password, Date dateNaissance, String email, Long tel, int numCnss,
		String nationnalite, String adresse, String status) {
	super();
	this.nif = nif;
	this.login = login;
	this.password = password;
	this.dateNaissance = dateNaissance;
	this.email = email;
	this.tel = tel;
	this.numCnss = numCnss;
	this.nationnalite = nationnalite;
	this.adresse = adresse;
	this.status = status;
}
@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return null;
}

}
