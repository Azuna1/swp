package swp.usecase.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import swp.dao.GeraetDAO;
import swp.entity.EmailTO;
import swp.entity.GeraetTO;
import swp.entity.impl.Geraet;
import swp.usecase.IGeraeteManager;

@Stateless
public class GeraeteManager implements IGeraeteManager {

	@Inject 
	GeraetDAO geraetDAO; 
	
	@Override
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename, int anzahl, byte[] imageBuffer) 
	{
		Geraet aGeraet = new Geraet(beschreibung, kategorie, preis, geraetename, anzahl, imageBuffer);			
		geraetDAO.save(aGeraet);		
	}

	@Override
	public boolean deleteGeraet(int geraetId) {
		Geraet aGeraet = geraetDAO.find(geraetId);		
		if (aGeraet == null) 
			return false;
		else {
			geraetDAO.deleteGeraet(aGeraet);
			return true;
		}
	}

	@Override
	public List<GeraetTO> getAllGeraete() {
		List<Geraet> aList = geraetDAO.findAll();
		List<GeraetTO> returnList = new ArrayList<GeraetTO>();
		for (Geraet aGeraet : aList) 
			returnList.add(aGeraet.toGeraetTO());
		return returnList;
	}

	@Override
	public void editGeraet(GeraetTO gTO) {		
		geraetDAO.editGeraet(gTO);
		
	}

	@Override
	public GeraetTO getGeraet(int id) {
		Geraet g = geraetDAO.find(id);		
		return (g == null) ? null : g.toGeraetTO();
	}

	@Override
	public List<GeraetTO> getFilteredGeraete(String name, String kategorie) {		
		List<Geraet> aList = geraetDAO.getFilteredGeraet(name, kategorie);
		List<GeraetTO> returnList = new ArrayList<GeraetTO>();
		for (Geraet aGeraet : aList) returnList.add(aGeraet.toGeraetTO());
		return returnList;
	}
}
