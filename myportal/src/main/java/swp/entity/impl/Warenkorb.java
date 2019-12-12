package swp.entity.impl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class Warenkorb implements Serializable {

	private static final long serialVersionUID = 301122L;
	@Id
	int warenkorbID;
	int artikelanzahl;
	Date erstellungsdatum;
	Date frist;
	Geraet geraete;
	Rechnung rechnungen;
	
	
	public Warenkorb() {}
	public Warenkorb(int artikelanzahl, Date erstellungsdatum, Date frist, Geraet geraete, Rechnung rechnungen) {
		super();
		this.artikelanzahl = artikelanzahl;
		this.erstellungsdatum = erstellungsdatum;
		this.frist = frist;
		this.geraete = geraete;
		this.rechnungen = rechnungen;
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
	public Geraet getGeraete() {
		return geraete;
	}
	public void setGeraete(Geraet geraete) {
		this.geraete = geraete;
	}
	public Rechnung getRechnungen() {
		return rechnungen;
	}
	public void setRechnungen(Rechnung rechnungen) {
		this.rechnungen = rechnungen;
	}
	
	
}
