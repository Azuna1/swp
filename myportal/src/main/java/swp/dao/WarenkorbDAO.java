package swp.dao;

import javax.ejb.Stateless;


import swp.entity.impl.Warenkorb;

@Stateless
public class WarenkorbDAO extends GenericDAO<Warenkorb>{
	
	public WarenkorbDAO() {
		super(Warenkorb.class);
	}

}
