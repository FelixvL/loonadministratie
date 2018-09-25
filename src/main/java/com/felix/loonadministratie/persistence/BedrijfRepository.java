package com.felix.loonadministratie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.felix.loonadministratie.domein.Bedrijf;

@Component
public interface BedrijfRepository extends CrudRepository<Bedrijf, Long>{

}
