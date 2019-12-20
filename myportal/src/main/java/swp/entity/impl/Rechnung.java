package swp.entity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
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
	@SequenceGenerator(name="rechnungs_id", sequenceName="SEQ_RECHNUNGS_ID", allocationSize = 1)
	int rechnungsID;
	boolean istBezahlt;
	String matrikelNr;
	double rechnungsbetrag;
	Date rechnungsdatum;
	String username;
	ArrayList<String> artikel = new ArrayList<String>();
	
	public Rechnung() {}
	
	public RechnungTO toRechnungTO()
	{
		RechnungTO rechnungTO = new RechnungTO();
		rechnungTO.setRechnungsID(this.getRechnungsID());
		rechnungTO.setIstBezahlt(this.getIstBezahlt());
		rechnungTO.setMatrikelNr(this.getMatrikelNr());
		rechnungTO.setRechnungsbetrag(this.getRechnungsbetrag());
		rechnungTO.setRechnungsdatum(this.getRechnungsdatum());
		rechnungTO.setUsername(this.getUsername());
		rechnungTO.setArtikel(this.getArtikel());
		return rechnungTO;
	}
	
	public Rechnung(boolean istBezahlt, String matrikelNr, double rechnungsbetrag, Date rechnungsdatum,
			String username, ArrayList<String> artikel) {
		this.istBezahlt = istBezahlt;
		this.matrikelNr = matrikelNr;
		this.rechnungsbetrag = rechnungsbetrag;
		this.rechnungsdatum = rechnungsdatum;
		this.username = username;
		this.artikel = artikel;
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
	public double getRechnungsbetrag() {
		return rechnungsbetrag;
	}
	public void setRechnungsbetrag(double rechnungsbetrag) {
		this.rechnungsbetrag = rechnungsbetrag;
	}
	public Date getRechnungsdatum() {
		return rechnungsdatum;
	}
	public void setRechnungsdatum(Date rechnungsdatum) {
		this.rechnungsdatum = rechnungsdatum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<String> getArtikel() {
		return artikel;
	}

	public void setArtikel(ArrayList<String> artikel) {
		this.artikel = artikel;
	}
	
	
	
}
