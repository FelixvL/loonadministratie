package com.felix.loonadministratie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.felix.loonadministratie.domein.Loonstrook;

@Component
public interface LoonstrookRepository extends CrudRepository<Loonstrook, Long>{
	
}
