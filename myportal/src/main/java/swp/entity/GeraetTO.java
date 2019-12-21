package swp.entity;

import java.io.Serializable;

import swp.entity.impl.Geraet;

public class GeraetTO implements Serializable {

	private static final long serialVersionUID = 3022L;

	int geraeteID;
	String beschreibung;
	String kategorie;
	double preis;
	String geraetename;
	int anzahl;

	public GeraetTO() {
	}

	public Geraet toGeraet() {
		Geraet geraet = new Geraet(this.getBeschreibung(), this.getKategorie(), this.getPreis(), this.getGeraetename(),
				this.getAnzahl());
		return geraet;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
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
