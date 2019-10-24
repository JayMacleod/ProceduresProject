package com.nw.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nw.entity.Procedures;

@Repository
public interface ProceduresRepository extends JpaRepository<Procedures, Integer>{
	
	public ArrayList<Procedures> findAll();
	
	public Procedures findByproId(int Id);
	
	public ArrayList<Procedures> findByproName(String Name);
	
	public ArrayList<Procedures> findByproSpeciality(String Speciality);
	
	public ArrayList<Procedures> findByproInstruments(String Instruments);
	
	public String findInstruments(int Id);
	
	public String deleteByproId(int Id);

}
