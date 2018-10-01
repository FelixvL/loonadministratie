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

import com.felix.loonadministratie.domein.Werknemer;
import com.felix.loonadministratie.persistence.LoonService;

@RestController
public class LoonEndpoint {
	@Autowired
	private LoonService loonService;
	
	@GetMapping("loon")
	public Iterable<Werknemer> getAlleWerknemers(){
		return loonService.getWerknemers();
	}

}
