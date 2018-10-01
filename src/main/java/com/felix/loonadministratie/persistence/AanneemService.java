package com.felix.loonadministratie.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felix.loonadministratie.domein.Bedrijf;
import com.felix.loonadministratie.domein.Werknemer;

@Service
@Transactional
public class AanneemService {
	@Autowired
	private WerknemerRepository werknemerRepository;

	@Autowired
	private BedrijfRepository bedrijfRepository;
	
	public Werknemer slaWerknemerOp(Long id, Werknemer werknemer) {
		werknemer = werknemerRepository.save(werknemer);
		Optional<Bedrijf> bedrijf = bedrijfRepository.findById(id);
		werknemer.setBedrijf(bedrijf.get());   // Objecten OCA ORM
		return werknemerRepository.save(werknemer);
	}
}
