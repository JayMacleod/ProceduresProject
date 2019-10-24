package com.nw.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nw.entity.Instruments;

@Repository
public interface InstrumentsRepository extends JpaRepository<Instruments, Integer>{
	
	public ArrayList<Instruments> findAll();
	
	public Instruments findByinsId(int Id);
	
	public ArrayList<Instruments> findByinsName(String Name);

}