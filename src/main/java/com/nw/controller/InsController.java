package com.nw.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nw.entity.Instruments;
import com.nw.repository.InstrumentsRepository;

@RestController
public class InsController {

	@Autowired
	private InstrumentsRepository insRep;

	@GetMapping("/showAllInstruments")
	public ArrayList<Instruments> showAllInstruments(){
		return insRep.findAll();
	}
	
	@GetMapping("/showByInstrumentId/{Id}")
	public Instruments findInsId(@PathVariable int Id){
		return insRep.findByinsId(Id);
	}
	
	@GetMapping("/showByInstrumentName/{N}")
	public ArrayList<Instruments>  findProName(@PathVariable String N){
		return insRep.findByinsName(N);
	}
	
	@PostMapping("/saveInstrument/{Id}/{name}")
	public String saveInstrument(@PathVariable int Id, @PathVariable String name) {
		
		Instruments Ref = new Instruments();
		
		Ref.setInsId(Id);
		Ref.setInsName(name);
		
		insRep.save(Ref);
	
		return "Saved";
	}
}


