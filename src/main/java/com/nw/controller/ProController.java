package com.nw.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nw.entity.Procedures;
import com.nw.service.ProceduresService;

@RestController
@RequestMapping("/proceduresapp")
@CrossOrigin("*")
public class ProController {
	
	@Autowired
	private ProceduresService proService;

	@GetMapping("/procedures")
//	public List<Procedures> getAllProcedures() {
//		return proService.getAllProcedures();
	}
	
//	@PostMapping("/procedures")
	public Procedures addNewProcedures(@RequestBody Procedures procedure) {
		return proService.addNewProcedure(procedure);
	}
	
	@PutMapping("/procedures")
	public Procedures updateProcedures(@RequestBody Procedures procedure) {
		return proService.updateProcedure(procedure);
	}
	
	
	@DeleteMapping("/procedures/{id}")
	public String deleteProcedures(@PathVariable(value = "id") int id) {
		return proService.deleteProcedure(id);
	}
	
	@GetMapping("/showById/{id}")
	public Procedures findById(@PathVariable(value = "id") int id) {
		return proService.findById(id);
	}
	
}
