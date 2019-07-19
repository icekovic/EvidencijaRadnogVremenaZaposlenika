package com.evidencija.aplikacija.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evidencija.aplikacija.dao.ZaposlenikRepository;

@RestController
public class ZaposlenikController
{
	private ZaposlenikRepository zaposlenikRepository;
	
	public ZaposlenikController(ZaposlenikRepository zaposlenikRepository)
	{
		this.zaposlenikRepository = zaposlenikRepository;
	}
	
	@GetMapping("/")
	public void registracija()
	{
		
	}
	
	@GetMapping("/prijava")
	public void prijava()
	{
		
	}
}
