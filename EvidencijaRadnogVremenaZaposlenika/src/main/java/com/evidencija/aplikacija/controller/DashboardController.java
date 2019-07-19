package com.evidencija.aplikacija.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evidencija.aplikacija.dao.ZapisRepository;
import com.evidencija.aplikacija.entities.Zapis;

@RestController
public class DashboardController
{
	private ZapisRepository zapisRepository;
	private ZaposlenikController zaposlenikController;
	
	public DashboardController(ZapisRepository zapisRepository, ZaposlenikController zaposlenikController)
	{
		this.zapisRepository = zapisRepository;
		this.zaposlenikController = zaposlenikController;
	}
	
	@GetMapping("/dashboard")
	private List<Zapis> dashboard()
	{
		return zapisRepository.findAll();
	}
}
