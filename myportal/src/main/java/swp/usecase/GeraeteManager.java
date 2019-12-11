package swp.usecase;

import java.util.ArrayList;
import java.util.List;
import swp.dao.GeraetDAO;
import swp.entity.Geraet;

//@Stateless
public class GeraeteManager implements IGeraeteManager {

	//@Inject 
	GeraetDAO geraetDAO; 
	
	@Override
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename) 
	{
		Geraet aGeraet = new Geraet(beschreibung, kategorie, preis, geraetename);
		geraetDAO.createGeraet(aGeraet);
		
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
	public List<Geraet> getAllGeraete() {
		List<Geraet> aList = geraetDAO.getAllGeraete();
		List<Geraet> returnList = new ArrayList<Geraet>();
		for (Geraet aGeraet : aList) returnList.add(aGeraet);
		return returnList;
	}

	@Override
	public void editGeraet(Geraet geraet) {
		geraetDAO.editGeraet(geraet);
		
	}
}
