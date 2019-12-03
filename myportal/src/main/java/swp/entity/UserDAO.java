package swp.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAO {
	
	
	 
	public static void doit()
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("swpDB");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		User newUser = new User();
		newUser.setFullname("mytest boy");
		entityManager.persist(newUser);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
	

}
