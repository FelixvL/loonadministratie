package com.felix.loonadministratie.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felix.loonadministratie.domein.Bedrijf;

@Service
@Transactional
public class BedrijfService {
	@Autowired
	private BedrijfRepository bedrijfRepository;
	
	public Iterable<Bedrijf> geefAlleBedrijven(){
		return bedrijfRepository.findAll();
	} 

}
