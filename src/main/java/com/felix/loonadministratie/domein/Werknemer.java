package com.felix.loonadministratie.domein;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Werknemer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;   // let op long dubbelcheck
	
	private String voornaam;
	private String achternaam;
	private LocalDate geboortedatum;
	
	@ManyToOne
	private Bedrijf bedrijf;
	
	@OneToMany
	private List<Loonstrook> loonstroken;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public LocalDate getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

	public Bedrijf getBedrijf() {
		return bedrijf;
	}

	public void setBedrijf(Bedrijf bedrijf) {
		this.bedrijf = bedrijf;
	}

	public List<Loonstrook> getLoonstroken() {
		return loonstroken;
	}

	public void setLoonstroken(List<Loonstrook> loonstroken) {
		this.loonstroken = loonstroken;
	}
}
