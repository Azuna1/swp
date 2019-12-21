package swp.usecase;

import java.util.List;

import javax.ejb.Local;

import swp.entity.UserTO;

@Local
public interface IUserManager {
	public void createUser(String name);
	public boolean existUser(String name);
	public void deleteUser(String name);
	public List<UserTO> getAll();
}
