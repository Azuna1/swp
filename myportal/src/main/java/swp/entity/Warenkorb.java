package swp.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
/* Keine Speicherung von Warenkorb in der DB*/
public class Warenkorb {

	int artikelanzahl;
	Date erstellungsdatum;
	Date frist;
	Geraet geraete;
	Rechnung rechnungen;
	
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
