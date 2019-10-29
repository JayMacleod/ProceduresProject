package com.nw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nw.entity.Procedures;

@Repository
public interface ProceduresRepository extends JpaRepository<Procedures, Integer>{
	
	public Procedures findById(int id);

}
