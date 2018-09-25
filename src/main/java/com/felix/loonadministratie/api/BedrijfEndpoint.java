package com.felix.loonadministratie.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felix.loonadministratie.domein.Bedrijf;
import com.felix.loonadministratie.persistence.BedrijfService;

@RestController
public class BedrijfEndpoint {
	@Autowired
	private BedrijfService bedrijfService;
	
	@GetMapping("bedrijf")
	public Iterable<Bedrijf> ffProberen() {
		
		return bedrijfService.geefAlleBedrijven();
	}
}
