package swp.portal.beans;

import java.util.List;

import javax.inject.Inject;

import com.vaadin.cdi.annotation.VaadinSessionScoped;

import swp.entity.GeraetTO;
import swp.usecase.IGeraeteManager;


@VaadinSessionScoped
public class GeraetMB {
	
	@Inject 
	IGeraeteManager geraeteManager;
	
	
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename, int anzahl) 
	{		
		geraeteManager.createGeraet( beschreibung,  kategorie,  preis, geraetename, anzahl);		
	}
	
	public List<GeraetTO> getAllGeraete() {
		return geraeteManager.getAllGeraete();
	}
	
	public void deleteGeraet(int id) {
		geraeteManager.deleteGeraet(id);
	}
	public GeraetTO getGeraet(int id) {
		return geraeteManager.getGeraet(id);
	}
	
	public void editGeraet(int id, String beschreibung, String kategorie, double preis, String geraetename, int anzahl) {
		GeraetTO gTO = new GeraetTO();
		gTO.setGeraeteID(id);
		gTO.setBeschreibung(beschreibung);
		gTO.setKategorie(kategorie);
		gTO.setPreis(preis);
		gTO.setGeraetename(geraetename);
		gTO.setAnzahl(anzahl);
		geraeteManager.editGeraet(gTO);
	}
	
	public List<GeraetTO> getFilteredGeraete(String name, String kategorie) {
		return geraeteManager.getFilteredGeraete(name, kategorie);
	}

}
