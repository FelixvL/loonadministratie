package com.felix.loonadministratie.api;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.felix.loonadministratie.domein.Bedrijf;
import com.felix.loonadministratie.domein.Werknemer;
import com.felix.loonadministratie.persistence.AanneemService;
import com.felix.loonadministratie.persistence.BedrijfService;

@RestController
@Path("bedrijf")
public class BedrijfEndpoint {
	@Autowired
	private BedrijfService bedrijfService;
	
	@Autowired
	private AanneemService aanneemService;	
	
	@GetMapping
	public Iterable<Bedrijf> ffProberen() {		
		return bedrijfService.geefAlleBedrijven();
	}
	@PostMapping
	public Bedrijf bedrijfOpslaan(@RequestBody Bedrijf bedrijf) {
		return bedrijfService.slaBedrijfOp(bedrijf);
	}
	@PutMapping
	public Bedrijf bedrijfUpdaten(@RequestBody Bedrijf bedrijf) {
		return bedrijfService.slaBedrijfOp(bedrijf);
	}	
	@DeleteMapping("bedrijf/{id}")
	public void bedrijfVerwijderen(@PathVariable Long id) {
		bedrijfService.verwijderBedrijf(id);
	}

	@PostMapping("aannemen/{id}")
	public Werknemer werknemerAannemen(@PathVariable Long id, @RequestBody Werknemer werknemer) {
		System.out.println("bekijken");
		return aanneemService.slaWerknemerOp(id, werknemer);
	}
	
}







