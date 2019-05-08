package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.DeclarationOnImpots.Entity.Contribuable;





public interface ContribuableRepository extends JpaRepository<Contribuable,Long>{
 @Query("select c from Contribuable c where c.login like :x")
	public Page<Contribuable> chercher(@Param("x")String mc, Pageable pageable);
 @Query(" select c from Contribuable c " +
         " where c.login = ?1")


 Contribuable findUserWithName(String login);
 @Query("select c from Contribuable c where c.NIF = ?1")
 Contribuable findOne(Long NIF);
 @Modifying
	@Query("update Contribuable c set c.Status = ?2 where c.NIF = ?1")
	void changeStatus(Long NIF, String status);
}