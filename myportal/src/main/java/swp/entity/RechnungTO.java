package swp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import swp.entity.impl.Rechnung;

public class RechnungTO implements Serializable {

	private static final long serialVersionUID = 322L;
	private int rechnungsID;
	private boolean istBezahlt;
	private String matrikelNr;
	private Date rechnungsdatum;
	private String name;
	private String surname;
	private double endbetrag = 0;
	private String email;
	private ArrayList<String> artikel = new ArrayList<>();

	public RechnungTO() {
		this.istBezahlt = false;
		this.rechnungsdatum = new Date();
	}

	public Rechnung toRechnung() {
		Rechnung r = new Rechnung();
		r.setArtikel(artikel);
		r.setEndbetrag(endbetrag);
		r.setIstBezahlt(istBezahlt);
		r.setMatrikelNr(matrikelNr);
		r.setName(name);
		r.setRechnungsdatum(rechnungsdatum);
		r.setRechnungsID(rechnungsID);
		r.setSurname(surname);
		r.setEmail(email);

		return r;
	}

	public void addArtikel(String name, Double price) {
		artikel.add(String.format("%s für (%.2f€)", name , price));
		endbetrag += price;
	}

	public ArrayList<String> getArtikel() {
		return artikel;
	}

	public void setArtikel(ArrayList<String> artikel) {
		this.artikel = artikel;
	}

	public void setEndbetrag(double endbetrag) {
		this.endbetrag = endbetrag;
	}

	public int getRechnungsID() {
		return rechnungsID;
	}

	public void setRechnungsID(int rechnungsID) {
		this.rechnungsID = rechnungsID;
	}

	public boolean getIstBezahlt() {
		return istBezahlt;
	}

	public void setIstBezahlt(boolean istBezahlt) {
		this.istBezahlt = istBezahlt;
	}

	public String getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(String matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public Date getRechnungsdatum() {
		return rechnungsdatum;
	}

	public void setRechnungsdatum(Date rechnungsdatum) {
		this.rechnungsdatum = rechnungsdatum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getEndbetrag() {
		return endbetrag;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
