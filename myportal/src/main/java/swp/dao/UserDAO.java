package swp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import swp.entity.UserOld;

public class UserDAO {
	
	
	 
	public static void doit()
	{
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("swpDB");
		//EntityManager entityManager = factory.createEntityManager();
		
		//entityManager.getTransaction().begin();
		
		UserOld newUser = new UserOld();
		newUser.setFullname("mytest boy");
		//entityManager.persist(newUser);
		//entityManager.getTransaction().commit();
		//entityManager.close();
		//factory.close();
	}
	

}
