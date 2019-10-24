package com.nw.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nw.entity.Procedures;
import com.nw.repository.ProceduresRepository;

@RestController
public class ProController {
	
	@Autowired
	private ProceduresRepository proRep;

	@GetMapping("/showAllProcedures")
	public ArrayList<Procedures> showAllProcedures(){
		return proRep.findAll();
	}
	
	@GetMapping("/showByProcedureId/{Id}")
	public Procedures findProId(@PathVariable int Id){
		return proRep.findByproId(Id);
	}
	
	@GetMapping("/showByProcedureName/{N}")
	public ArrayList<Procedures>  findProName(@PathVariable String N){
		return proRep.findByproName(N);
	}
	
	@GetMapping("/showByProcedureSpeciality/{S}")
	public ArrayList<Procedures>  findProSpeciality(@PathVariable String S){
		return proRep.findByproSpeciality(S);
	}
	
	@GetMapping("/showByProcedureInstruments/{S}")
	public ArrayList<Procedures>  findProInstruments(@PathVariable String S){
		return proRep.findByproInstruments(S);
	}
	
	@PostMapping("/saveProcedure/{Id}/{name}/{speciality}/{instruments}")
	public String saveProcedure(@PathVariable int Id, @PathVariable String name, @PathVariable String speciality, @PathVariable String instruments) {
		
		Procedures Ref = new Procedures();
		
		Ref.setProId(Id);
		Ref.setProName(name);
		Ref.setProSpeciality(speciality);
		Ref.setProInstruments(instruments);
		
		proRep.save(Ref);
	
		return "Saved";
	}
	
	@PostMapping("/saveProcedureDirect")
	public void saveProcedureData2(@RequestBody Procedures Ref) {
		proRep.save(Ref);
	}
	
	@DeleteMapping("/deleteProcedure/{Id}")
	public String deleteProcedures(@PathVariable int Id){
		proRep.deleteByproId(Id);
		return "Deleted";
	}
	
	@GetMapping("/findInstruments/{Id}")
	public String findInstruments(@PathVariable int Id) {
		return proRep.findInstruments(Id);
	}
	
	
}
