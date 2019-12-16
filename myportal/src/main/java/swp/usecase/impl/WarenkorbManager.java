package swp.usecase.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import swp.dao.WarenkorbDAO;
import swp.usecase.IWarenkorbManager;

@Stateless
public class WarenkorbManager implements IWarenkorbManager {

	@Inject
	WarenkorbDAO warenkorbDAO;
	
	@Override
	public void rmFromWarenkorb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kaufen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToWarenkorb() {
		// TODO Auto-generated method stub
		
	}
}
