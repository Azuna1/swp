package swp.usecase;

//import javax.ejb.Local;
import java.util.List;

import swp.entity.GeraetTO;

//@Local
public interface IGeraeteManager {
	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename);
	public boolean deleteGeraet(int geraetID);
	public List<GeraetTO> getAllGeraete();
	public void editGeraet (GeraetTO geraetTO);
}
