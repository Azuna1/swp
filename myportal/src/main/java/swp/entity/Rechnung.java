package swp.entity;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="rechnung")
public class Rechnung {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="rechnungs_id", sequenceName="SEQ_RECHNUNGS_ID", allocationSize = 1)
	int rechnungsnr;
	boolean istBezahlt;
	String matrikelNr;
	double rechnungsbetrag;
	Date rechnungsdatum;
	String username;
	Geraet geraete;
	
	public Rechnung(int rechnungsnr, boolean istBezahlt, String matrikelNr, double rechnungsbetrag, Date rechnungsdatum,
			String username, Geraet geraete) {
		super();
		this.rechnungsnr = rechnungsnr;
		this.istBezahlt = istBezahlt;
		this.matrikelNr = matrikelNr;
		this.rechnungsbetrag = rechnungsbetrag;
		this.rechnungsdatum = rechnungsdatum;
		this.username = username;
		this.geraete = geraete;
	}
	
	public int getRechnungsnr() {
		return rechnungsnr;
	}
	public void setRechnungsnr(int rechnungsnr) {
		this.rechnungsnr = rechnungsnr;
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
