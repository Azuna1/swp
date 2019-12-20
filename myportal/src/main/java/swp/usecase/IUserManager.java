package swp.usecase;

import javax.ejb.Local;

@Local
public interface IUserManager {
	public void createUser(String name);
	public boolean existUser(String name);
	public void deleteUser(String name);
}
