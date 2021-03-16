package com.org.prj.mod.myservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.org.prj.mod.myservice.entity.Customer;
import com.org.prj.mod.myservice.entity.Personentity;

public interface PersonRepo extends JpaRepository<Customer, Long> {
	@Query(
			value = "select id AS person_id, " + "name AS person_nm " + "from springbootdb.mintest "
				+ "where id = :person_id", nativeQuery = true)
	List<Personentity> findDetailfromId(@Param("person_id") String Id);

	
	@Query(
			value = "select id AS person_id, " + 
					" name AS person_nm from springbootdb.mintest "
			, nativeQuery = true)
	List<Personentity> findAllsqlrec();
	
	
}
