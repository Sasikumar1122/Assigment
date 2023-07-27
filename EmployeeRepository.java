package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.Entity.EmployeeEntity;

import jakarta.persistence.Entity;
@Repository
public interface EmployeeRepository extends JpaRepository<Entity, Integer> {
	@Query(value = "select * from  sys.curd where id =:id or name = :name ", nativeQuery = true)
	public EmployeeEntity getIDandAName(int id, String name);

	public EmployeeEntity findById(int id);
	
	
}
