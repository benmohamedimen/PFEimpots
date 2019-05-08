package com.dev.DeclarationOnImpots.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;

public interface PersonnePhyzRepository extends JpaRepository<PersonnePhyz,Long> {
	
	
 @Query(" select c from PersonnePhyz c " +
         " where c.Nom = ?1")


 PersonnePhyz findUserWithName(String nom);
 @Query("select c from PersonnePhyz c where c.Cin = ?1")
 PersonnePhyz findOne(Long Cin);
 
}
