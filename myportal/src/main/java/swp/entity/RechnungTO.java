package swp.entity;

import java.io.Serializable;
import java.util.Date;

import swp.entity.impl.Geraet;
import swp.entity.impl.Rechnung;

public class RechnungTO implements Serializable {

	private static final long serialVersionUID = 322L;
	int rechnungsID;
	boolean istBezahlt;
	String matrikelNr;
	double rechnungsbetrag;
	Date rechnungsdatum;
	String username;
	Geraet geraete;
	
	public RechnungTO() {}
	
	public Rechnung toRechnung() {
		Rechnung rechnung = new Rechnung( this.getIstBezahlt(),this.getMatrikelNr(),this.getRechnungsbetrag(),
				this.getRechnungsdatum(),this.getUsername(),this.getGeraete());
		return rechnung;
		
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
	public Geraet getGeraete() {
		return geraete;
	}
	public void setGeraete(Geraet geraete) {
		this.geraete = geraete;
	}
	
	
}
