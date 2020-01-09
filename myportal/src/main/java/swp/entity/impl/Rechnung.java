package swp.entity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import swp.entity.RechnungTO;

@Entity
public class Rechnung implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "rechnungs_id", sequenceName = "SEQ_RECHNUNGS_ID", allocationSize = 1)
	private int rechnungsID;
	private boolean istBezahlt;
	private String matrikelNr;
	private Date rechnungsdatum;
	private String name;
	private String surname;
	private double endbetrag = 0;
	private String email;

	@ElementCollection
	private List<String> artikel = new ArrayList<>();

	public RechnungTO toRechnungTO() {
		RechnungTO rechnungTO = new RechnungTO();
		rechnungTO.setEndbetrag(endbetrag);
		rechnungTO.setIstBezahlt(istBezahlt);
		rechnungTO.setMatrikelNr(matrikelNr);
		rechnungTO.setName(name);
		rechnungTO.setSurname(surname);
		rechnungTO.setRechnungsID(rechnungsID);
		rechnungTO.setRechnungsdatum(rechnungsdatum);
		rechnungTO.setArtikel(new ArrayList<String>(artikel));
		rechnungTO.setEmail(email);

		return rechnungTO;
	}

	public Rechnung() {

	}

	public Rechnung(String matrikelNr, String name, String surname, String email) {
		this.matrikelNr = matrikelNr;
		this.name = name;
		this.surname = surname;
		this.rechnungsdatum = new Date();
		this.istBezahlt = false;
		this.email = email;
	}

	public void addArtikel(String name, Double price) {
		artikel.add(String.format("%s für (%.2f€)", name, price));
		this.endbetrag += price;
	}

	public ArrayList<String> getArtikel() {
		return new ArrayList<String>(artikel);
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

	public boolean isIstBezahlt() {
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
