package swp.usecase.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import swp.dao.KategorieDAO;
import swp.entity.KategorieTO;
import swp.entity.impl.Kategorie;
import swp.usecase.IKategorieManager;

@Stateless
public class KategorieManager implements IKategorieManager {

	@Inject
	KategorieDAO kategorieDAO;
	
	@Override
	public void createKategorie(String name) {
		Kategorie kat = new Kategorie(name);
		kategorieDAO.save(kat);
		
	}

	@Override
	public List<KategorieTO> getKategorien() {
		// TODO Auto-generated method stub
		List<Kategorie> kats = kategorieDAO.findAll();
		List<KategorieTO> katTOs = new ArrayList<KategorieTO>();
		
		for (Kategorie kat : kats)
			katTOs.add(kat.toKategorieTO());
		
		return katTOs;
	}

	@Override
	public void deleteKategorie(String name) {
		kategorieDAO.delete(name);
		
	}
	

}
