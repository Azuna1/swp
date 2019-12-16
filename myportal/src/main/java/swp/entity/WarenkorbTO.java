package swp.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import swp.entity.impl.Geraet;
import swp.entity.impl.Warenkorb;

public class WarenkorbTO implements Serializable {

	private static final long serialVersionUID = 302L;
	int warenkorbID;
	int artikelanzahl;
	Date erstellungsdatum;
	Date frist;
	ArrayList<GeraetTO> geraeteToList = new ArrayList<GeraetTO>();
	
	public WarenkorbTO () {}
	
	public Warenkorb toWarenkorb( ) {
		Warenkorb warenkorb = new Warenkorb(this.getArtikelanzahl(),
				this.getErstellungsdatum(),
				this.getFrist(),
				this.toGeraeteList(geraeteToList));
		return warenkorb;
	}
	
	public ArrayList<Geraet> toGeraeteList(ArrayList<GeraetTO> toList) {
		ArrayList<Geraet> tempArrayList = new ArrayList<Geraet>();
		for(GeraetTO g : toList ) {
			tempArrayList.add(g.toGeraet());
		}
		return tempArrayList;
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

	public ArrayList<GeraetTO> getGeraete() {
		return geraeteToList;
	}

	public void setGeraete(ArrayList<GeraetTO> geraete) {
		this.geraeteToList = geraete;
	}

	
	
	
}
