package com.nw.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nw.entity.Procedures;
import com.nw.repository.ProceduresRepository;

@Service
public class ProceduresService {
	
	@Autowired
	private ProceduresRepository ProRep;
	
	public ProceduresService() {
	}
	
	public List<Procedures> getAllProcedures() {
		
		if (ProRep.findAll().isEmpty()) {
			setUpProcedures();
		}
		return ProRep.findAll();
	}
	
	private void setUpProcedures() {
		Procedures Op1 = new Procedures("Name Test", "Speciality Test", "Instrument Test");
		ProRep.save(Op1);
	}
	
	public Procedures addNewProcedure(Procedures procedure) {
		return ProRep.save(procedure);
	}
	
	public Procedures updateProcedure(Procedures procedure) {
		return ProRep.save(procedure);
	}

	public String deleteProcedure(int id) {
		ProRep.deleteById(id);;
		return "Procedure succesfully deleted";
	}
	

}
