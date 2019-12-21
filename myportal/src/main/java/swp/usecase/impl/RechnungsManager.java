package swp.usecase.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import swp.dao.RechnungDAO;
import swp.entity.GeraetTO;
import swp.entity.RechnungTO;
import swp.entity.impl.Geraet;
import swp.entity.impl.Rechnung;
import swp.usecase.IRechnungsManager;

@Stateless
public class RechnungsManager implements IRechnungsManager {

	@Inject
	RechnungDAO rechnungDAO;

	@Override
	public List<RechnungTO> getAll() {
		List<Rechnung> aList = rechnungDAO.findAll();
		List<RechnungTO> returnList = new ArrayList<RechnungTO>();
		for (Rechnung aRechnung : aList)
			returnList.add(aRechnung.toRechnungTO());
		return returnList;

	}

	@Override
	public RechnungTO getRechnung(int id) {
		Rechnung r = rechnungDAO.find(id);
		return (r == null) ? null : r.toRechnungTO();
	}

	@Override
	public void createRechnung(String matrikelNr, String name, String surname, List<GeraetTO> artikel) {
		Rechnung aRechnung = new Rechnung(matrikelNr, name, surname);
		artikel.forEach(e -> {
			aRechnung.addArtikel(e.getGeraetename(), e.getPreis());
		});
		rechnungDAO.save(aRechnung);

	}

	@Override
	public List<RechnungTO> getAllFromUser(String matrikelNR) {
		List<Rechnung> aList = rechnungDAO.getUserRechnungen(matrikelNR);
		List<RechnungTO> returnList = new ArrayList<RechnungTO>();
		for (Rechnung aRechnung : aList)
			returnList.add(aRechnung.toRechnungTO());
		return returnList;
	}

}
