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
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename) 
	{
		Geraet aGeraet = new Geraet(beschreibung, kategorie, preis, geraetename);
		System.out.println(geraetDAO == null);;
		System.out.println(aGeraet == null);;
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
		for (Geraet aGeraet : aList) returnList.add(aGeraet.toGeraetTO());
		return returnList;
	}

	@Override
	public void editGeraet(GeraetTO geraetTO) {
		geraetDAO.editGeraet(geraetTO);
		
	}

	@Override
	public GeraetTO getGeraet(int id) {
		Geraet g = geraetDAO.find(id);		
		return (g == null) ? null : g.toGeraetTO();
	}
}
