package swp.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="user")
public class User {
	
	@Id
	/*Primary Key ist matrikelNr?*/
	String matrikelNr;
	String username;
	String passwort;
	
	
	public User(String matrikelNr, String username, String passwort) {
		super();
		this.matrikelNr = matrikelNr;
		this.username = username;
		this.passwort = passwort;
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
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
	
}
