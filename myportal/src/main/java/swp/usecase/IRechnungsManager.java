package swp.usecase;

import java.util.List;

import javax.ejb.Local;

import swp.entity.GeraetTO;
import swp.entity.RechnungTO;

@Local
public interface IRechnungsManager {
	public List<RechnungTO> getAll();
	public List<RechnungTO> getAllFromUser(String matrikelNR);
	public RechnungTO getRechnung(int id);
	public void createRechnung(String matrikelNr, String name, String surname, List<GeraetTO> artikel);
	public void update(RechnungTO rTO);
}
