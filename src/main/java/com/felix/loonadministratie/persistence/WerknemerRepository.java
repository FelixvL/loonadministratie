package com.felix.loonadministratie.persistence;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.felix.loonadministratie.domein.Werknemer;

@Component
public interface WerknemerRepository extends CrudRepository<Werknemer, Long>{

}

