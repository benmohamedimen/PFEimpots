package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;



public interface ImpotsSocieteRepository extends JpaRepository<ImpotsSociete,Long> {
	 
	 
	 @Query("select c from ImpotsSociete c where c.ImpotsSocieteId = ?1")
	 ImpotsSociete findOne(Long ImpotsSocieteId);
	 
}