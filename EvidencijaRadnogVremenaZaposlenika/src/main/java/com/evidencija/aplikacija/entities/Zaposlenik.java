package com.evidencija.aplikacija.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Zaposlenik
{
	@Id
	@GeneratedValue
	private int idZaposlenik;
	
	@NonNull
	private String ime;
	
	@NonNull
	private String prezime;
	
	@NonNull
	private String email;
	
	@NonNull
	private String password;
	
	@ManyToMany
	private List<Zapis> zapisi;
	
}
