package swp.usecase;

import java.util.List;

import javax.ejb.Local;

import swp.entity.KategorieTO;

@Local
public interface IKategorieManager {
	public void createKategorie(String name);
	public List<KategorieTO> getKategorien();
	public void deleteKategorie(String name);
}
