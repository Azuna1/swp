package swp.entity.impl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

import swp.entity.GeraetTO;

@Entity
public class Geraet implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="geraete_id", sequenceName="SEQ_GERAET_ID", allocationSize = 1)
	int geraeteID;
	String beschreibung;
	String kategorie;
	double preis;
	String geraetename;
	int anzahl;
	


	public Geraet () {}
	
	public GeraetTO toGeraetTO()
	{
		GeraetTO geraetTO = new GeraetTO();
		geraetTO.setGeraeteID(this.getGeraeteID());
		geraetTO.setBeschreibung(this.getBeschreibung());
		geraetTO.setKategorie(this.getKategorie());
		geraetTO.setPreis(this.getPreis());
		geraetTO.setGeraetename(this.getGeraetename());
		geraetTO.setAnzahl(this.getAnzahlt());
		return geraetTO;
	}
	
	public Geraet(String beschreibung, String kategorie, double preis, String geraetename, int anzahl) {
		super();
		this.beschreibung = beschreibung;
		this.kategorie = kategorie;
		this.preis = preis;
		this.geraetename = geraetename;
		this.anzahl = anzahl;
	}
	
	public int getAnzahlt() {
		return anzahl;
	}

	public void setAnzahl(int anzahlt) {
		this.anzahl = anzahlt;
	}
	
	public int getGeraeteID() {
		return geraeteID;
	}
	public void setGeraeteID(int geraeteID) {
		this.geraeteID = geraeteID;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public String getKategorie() {
		return kategorie;
	}
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getGeraetename() {
		return geraetename;
	}
	public void setGeraetename(String geraetename) {
		this.geraetename = geraetename;
	}
	
	
}
