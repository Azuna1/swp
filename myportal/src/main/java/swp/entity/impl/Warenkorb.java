package swp.entity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warenkorb implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	int warenkorbID;
	int artikelanzahl;
	Date erstellungsdatum;
	Date frist;
	ArrayList<Geraet> geraete = new ArrayList<Geraet>();
	
	
	public Warenkorb() {}
	
	public Warenkorb(int artikelanzahl, Date erstellungsdatum, Date frist, ArrayList<Geraet> geraete) {
		this.artikelanzahl = artikelanzahl;
		this.erstellungsdatum = erstellungsdatum;
		this.frist = frist;
		this.geraete = geraete;
	}
	public int getArtikelanzahl() {
		return artikelanzahl;
	}
	public void setArtikelanzahl(int artikelanzahl) {
		this.artikelanzahl = artikelanzahl;
	}
	public Date getErstellungsdatum() {
		return erstellungsdatum;
	}
	public void setErstellungsdatum(Date erstellungsdatum) {
		this.erstellungsdatum = erstellungsdatum;
	}
	public Date getFrist() {
		return frist;
	}
	public void setFrist(Date frist) {
		this.frist = frist;
	}
	public ArrayList<Geraet> getGeraete() {
		return geraete;
	}
	public void setGeraete(ArrayList<Geraet> geraete) {
		this.geraete = geraete;
	}
	
	
}
