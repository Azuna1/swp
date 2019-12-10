package swp.entity.impl;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class User {
	
	/*Primary Key ist matrikelNr?*/
	@Id
	String matrikelNr;
	String username;
	String password;
	
	public User () {}
	
	public User(String matrikelNr, String username, String password) {
		super();
		this.matrikelNr = matrikelNr;
		this.username = username;
		this.password = password;
	}
	public String getMatrikelNr() {
		return matrikelNr;
	}
	public void setMatrikelNr(String matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPasswort(String password) {
		this.password = password;
	}

	public void setFullname(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
