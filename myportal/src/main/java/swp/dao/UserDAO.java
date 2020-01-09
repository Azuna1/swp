package swp.dao;

import javax.ejb.Stateless;

import swp.entity.impl.User;

@Stateless
public class UserDAO extends GenericDAO<User> {

	public UserDAO() {
		super(User.class);
	}

}