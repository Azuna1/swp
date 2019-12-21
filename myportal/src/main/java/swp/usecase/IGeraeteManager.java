package swp.usecase;


import java.util.List;

import javax.ejb.Local;

import swp.entity.GeraetTO;

@Local
public interface IGeraeteManager {
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename, int anzahl);
	public boolean deleteGeraet(int geraetID);
	public List<GeraetTO> getAllGeraete();
	public List<GeraetTO> getFilteredGeraete(String name, String kategorie);	
	public GeraetTO getGeraet(int id);
	public void editGeraet(GeraetTO gTO);
}
