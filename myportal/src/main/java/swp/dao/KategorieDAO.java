package swp.dao;

import javax.ejb.Stateless;

import swp.entity.impl.Kategorie;

@Stateless
public class KategorieDAO extends GenericDAO<Kategorie>{
	
	public KategorieDAO() {
		super(Kategorie.class);
	}
	
	public void deleteKategorie(Kategorie cat) {
		super.delete(cat.getName());
	}

}
