package com.nw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nw.repository.ProceduresRepository;

@Service
public class ProceduresService {
	
	@Autowired
	private ProceduresRepository ProRep;
	
	public String findInstruments(int Id) {
		return ProRep.findInstruments(Id);
	}

}
