package com.evidencija.aplikacija.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Raspored
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_raspored")
	private int id_raspored;
	
	@ManyToOne
	@JoinColumn(name="zapis_id")
	private Zapis zapis;
	
	@ManyToOne
	@JoinColumn(name="zaposlenik_id")
	private Zaposlenik zaposlenik;
	
	public Raspored() {
	}

	public int getId_raspored() {
		return id_raspored;
	}

	public void setId_raspored(int id_raspored) {
		this.id_raspored = id_raspored;
	}

	public Zapis getZapis() {
		return zapis;
	}

	public void setZapis(Zapis zapis) {
		this.zapis = zapis;
	}

	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}

	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}
}
