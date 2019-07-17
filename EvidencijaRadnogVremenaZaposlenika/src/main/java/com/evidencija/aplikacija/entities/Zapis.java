package com.evidencija.aplikacija.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Zapis
{
	@Id
	@GeneratedValue
	private int idZapis;
	
	@NonNull
	private String naziv;
	
	@NonNull
	private Date datum;
	
	@NonNull
	private Time vrijemeOd;
	
	@NonNull
	private Time vrijemeDo;
	
	@NonNull
	private int sati;
	
	@NonNull
	private int minute;
	
	@ManyToMany
	private List<Zapis> zaposlenici;
}
