package com.evidencija.aplikacija.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.evidencija.aplikacija.entities.Zaposlenik;

@RepositoryRestResource
public interface ZaposlenikRepository extends JpaRepository<Zaposlenik, Integer>
{
	
}
