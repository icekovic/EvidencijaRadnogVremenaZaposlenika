package com.evidencija.aplikacija.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.evidencija.aplikacija.dao.ZapisRepository;
import com.evidencija.aplikacija.dao.ZaposlenikRepository;
import com.evidencija.aplikacija.entities.Zapis;

@Controller
public class DashboardController
{
	
	private ZapisRepository zapisRepository;	
	private ZaposlenikRepository zaposlenikRepository;
	
	public DashboardController(ZapisRepository zapisRepository, ZaposlenikRepository zaposlenikRepository)
	{
		this.zapisRepository = zapisRepository;
		this.zaposlenikRepository = zaposlenikRepository;
	}
	
	@GetMapping("/dashboard")
	private List<Zapis> dashboard()
	{
		for(Zapis zapis : zapisRepository.findAll())
		{
			System.out.println(zapis.getNaziv());
		}
		
		return zapisRepository.findAll();
	}
}
