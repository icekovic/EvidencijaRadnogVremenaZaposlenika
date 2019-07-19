package com.evidencija.aplikacija.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Zaposlenik
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_zaposlenik")
	private int idZaposlenik;
	
	@NonNull
	@Column(name = "ime")
	private String ime;
	
	@NonNull
	@Column(name = "prezime")
	private String prezime;
	
	@NonNull
	@Column(name = "email")
	private String email;
	
	@NonNull
	@Column(name = "lozinka")
	private String lozinka;
	
	@OneToMany(mappedBy="zaposlenik")
	private List<Raspored> rasporedi;

	public Zaposlenik() {
		
	}

	public int getIdZaposlenik() {
		return idZaposlenik;
	}

	public void setIdZaposlenik(int idZaposlenik) {
		this.idZaposlenik = idZaposlenik;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public List<Raspored> getRasporedi() {
		return rasporedi;
	}

	public void setRasporedi(List<Raspored> rasporedi) {
		this.rasporedi = rasporedi;
	}
}
