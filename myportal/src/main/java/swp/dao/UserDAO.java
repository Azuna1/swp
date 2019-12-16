<<<<<<< HEAD
package swp.dao;

import java.util.HashMap;
import java.util.Map;

import swp.entity.impl.User;



public class UserDAO extends GenericDAO<User>{
	
	public UserDAO() {
    	super(User.class);
    }

    public User findUserByName(String username) {
    	Map<String, Object> parameters = new HashMap<String, Object>();
    	System.out.println("Username: "+username);
    	parameters.put("username", username);

    	return super.findOneResult(User.FIND_BY_MATRIKELNR, parameters);
    }
	 
	public static void doit()
	{
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("swpDB");
		//EntityManager entityManager = factory.createEntityManager();
		
		//entityManager.getTransaction().begin();
		
		//UserOld newUser = new UserOld();
		//newUser.setFullname("mytest boy");
		//entityManager.persist(newUser);
		//entityManager.getTransaction().commit();
		//entityManager.close();
		//factory.close();
	}
	

}
=======
package swp.dao;

import javax.ejb.Stateless;
import swp.entity.impl.User;

@Stateless
public class UserDAO extends GenericDAO<User>{
	
	public  UserDAO(){		
		super(User.class);		
	}

}
>>>>>>> develop
