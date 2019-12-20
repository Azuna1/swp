package swp.dao;

import javax.ejb.Stateless;

import swp.entity.impl.Email;

@Stateless
public class EmailDAO extends GenericDAO<Email>{
	
	public EmailDAO() {
		super(Email.class);
	}
	
	public void deleteEmail(Email mail) {
		super.delete(mail.getName());
	}

}
