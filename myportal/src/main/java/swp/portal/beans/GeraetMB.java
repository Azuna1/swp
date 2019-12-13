package swp.portal.beans;

import java.io.Serializable;

import javax.inject.Inject;

import com.vaadin.cdi.annotation.VaadinSessionScoped;

import swp.usecase.IGeraeteManager;


@VaadinSessionScoped
public class GeraetMB implements Serializable{
	private static final long serialVersionUID = 7637606942615384944L;
	
	@Inject 
	IGeraeteManager gm;
	
	
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename) 
	{
		
		gm.createGeraet( beschreibung,  kategorie,  preis, geraetename);
		
	}

}
