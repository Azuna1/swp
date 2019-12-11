package swp.entity;

import java.io.Serializable;
import java.util.Date;
import swp.entity.impl.Geraet;
import swp.entity.impl.Rechnung;
import swp.entity.impl.Warenkorb;

public class WarenkorbTO implements Serializable {

	private static final long serialVersionUID = 302L;
	int warenkorbID;
	int artikelanzahl;
	Date erstellungsdatum;
	Date frist;
	Geraet geraete;
	Rechnung rechnungen;
	
	public WarenkorbTO () {}
	
	public Warenkorb toWarenkorb( ) {
		Warenkorb warenkorb = new Warenkorb(this.getArtikelanzahl(),this.getErstellungsdatum(),this.getFrist(),
				this.getGeraete(),this.getRechnungen());
		return warenkorb;
	}
	

	public int getWarenkorbID() {
		return warenkorbID;
	}

	public void setWarenkorbID(int warenkorbID) {
		this.warenkorbID = warenkorbID;
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
