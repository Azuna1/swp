package swp.entity.impl;

import java.io.Serializable;
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
@Access(AccessType.FIELD)
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
	Geraet geraete;
	
	public Rechnung() {}
	
	public RechnungTO toRechnungTO()
	{
		RechnungTO rechnungTO = new RechnungTO();
		rechnungTO.setRechnungsID(this.getRechnungsID());
		rechnungTO.setIstBezahlt(this.isIstBezahlt());
		rechnungTO.setMatrikelNr(this.getMatrikelNr());
		rechnungTO.setRechnungsbetrag(this.getRechnungsbetrag());
		rechnungTO.setRechnungsdatum(this.getRechnungsdatum());
		rechnungTO.setUsername(this.getUsername());
		rechnungTO.setGeraete(this.getGeraete());
		
		return rechnungTO;
	}
	
	public Rechnung(int rechnungsID, boolean istBezahlt, String matrikelNr, double rechnungsbetrag, Date rechnungsdatum,
			String username, Geraet geraete) {
		this.rechnungsID = rechnungsID;
		this.istBezahlt = istBezahlt;
		this.matrikelNr = matrikelNr;
		this.rechnungsbetrag = rechnungsbetrag;
		this.rechnungsdatum = rechnungsdatum;
		this.username = username;
		this.geraete = geraete;
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
