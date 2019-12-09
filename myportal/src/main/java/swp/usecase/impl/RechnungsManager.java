package swp.usecase.impl;

import swp.dao.RechnungDAO;
import swp.usecase.IRechnungsManager;

//@Stateless
public class RechnungsManager implements IRechnungsManager {

	//@Inject
	RechnungDAO rechnungDAO;
	
	@Override
	public void berechneEndbetrag() {
	//TODO	
	}
}
