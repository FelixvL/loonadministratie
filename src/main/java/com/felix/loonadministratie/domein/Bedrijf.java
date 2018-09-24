package com.felix.loonadministratie.domein;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bedrijf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String naam;
	private String straat;
	private int huisnummer;
	private LocalDate oprichtingsDatum;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public int getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}
	public LocalDate getOprichtingsDatum() {
		return oprichtingsDatum;
	}
	public void setOprichtingsDatum(LocalDate oprichtingsDatum) {
		this.oprichtingsDatum = oprichtingsDatum;
	}

	

}
