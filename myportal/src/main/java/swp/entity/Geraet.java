package swp.entity;

import javax.persistence.Access;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="geraet")
public class Geraet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="geraete_id", sequenceName="SEQ_GERAET_ID", allocationSize = 1)
	int geraeteID;
	String beschreibung;
	String kategorie;
	double preis;
	String geraetename;
	
	public Geraet () {}
	public Geraet(String beschreibung, String kategorie, double preis, String geraetename) {
		super();
		this.beschreibung = beschreibung;
		this.kategorie = kategorie;
		this.preis = preis;
		this.geraetename = geraetename;
	}
	
	public int getGeraeteid() {
		return geraeteID;
	}
	public void setGeraeteid(int geraeteID) {
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
