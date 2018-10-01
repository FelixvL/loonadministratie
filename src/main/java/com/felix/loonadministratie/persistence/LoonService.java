package com.felix.loonadministratie.persistence;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felix.loonadministratie.domein.Werknemer;


@Service
@Transactional
public class LoonService {
	@Autowired
	private WerknemerRepository werknemerRepository;
	
	@Autowired
	private LoonstrookRepository loonstrookRepository;
	
	public Iterable<Werknemer> getWerknemers(){
		return werknemerRepository.findAll();
	}
	
}
