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
	
	
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename) 
	{		
		geraeteManager.createGeraet( beschreibung,  kategorie,  preis, geraetename);		
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

}
