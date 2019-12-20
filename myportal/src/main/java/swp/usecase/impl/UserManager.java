package swp.usecase.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import swp.dao.UserDAO;
import swp.entity.impl.User;
import swp.usecase.IUserManager;

@Stateless
public class UserManager implements IUserManager {

	@Inject 
	UserDAO userDAO;
	
	@Override
	public void createUser(String name) {
		User user = new User(name);
		userDAO.save(user);
		
	}

	@Override
	public boolean existUser(String name) {
		// TODO Auto-generated method stub
		return userDAO.find(name) == null;
	}

	@Override
	public void deleteUser(String name) {
		userDAO.delete(name);
		
	}
	

}
