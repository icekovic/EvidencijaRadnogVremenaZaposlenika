package com.evidencija.aplikacija.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Zapis
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_zapis")
	private int idZapis;
	
	@NonNull
	@Column(name = "naziv")
	private String naziv;
	
	@NonNull
	@Column(name = "datum")
	private Date datum;
	
	@NonNull
	@Column(name = "vrijeme_od")
	private Time vrijemeOd;
	
	@NonNull
	@Column(name = "vrijeme_do")
	private Time vrijemeDo;
	
	@NonNull
	@Column(name = "sati")
	private int sati;
	
	@NonNull
	@Column(name = "minute")
	private int minute;
	
	@OneToMany(mappedBy="zapis")
	private List<Raspored> rasporedi;
	
	public Zapis() {
		super();
	}

	public int getIdZapis() {
		return idZapis;
	}

	public void setIdZapis(int idZapis) {
		this.idZapis = idZapis;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Time getVrijemeOd() {
		return vrijemeOd;
	}

	public void setVrijemeOd(Time vrijemeOd) {
		this.vrijemeOd = vrijemeOd;
	}

	public Time getVrijemeDo() {
		return vrijemeDo;
	}

	public void setVrijemeDo(Time vrijemeDo) {
		this.vrijemeDo = vrijemeDo;
	}

	public int getSati() {
		return sati;
	}

	public void setSati(int sati) {
		this.sati = sati;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public List<Raspored> getRasporedi() {
		return rasporedi;
	}

	public void setRasporedi(List<Raspored> rasporedi) {
		this.rasporedi = rasporedi;
	}
}
