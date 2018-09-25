package com.felix.loonadministratie.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loonstrook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int jaar;
	private int maand;
	private int bedrag;
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getJaar() {
		return jaar;
	}
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}
	public int getMaand() {
		return maand;
	}
	public void setMaand(int maand) {
		this.maand = maand;
	}
	public int getBedrag() {
		return bedrag;
	}
	public void setBedrag(int bedrag) {
		this.bedrag = bedrag;
	}	
}
