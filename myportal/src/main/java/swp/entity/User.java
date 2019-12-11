package swp.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@NamedQuery(name="User.findUserByName", query="select u from User u where u.username = :username")
@NamedQuery(name="User.findUserByMatrikelNr", query="select u from User u where u.matrikelNr = :matrikelNr")
public class User {
	
	@Id
	@Column(unique = true)
	/*Primary Key ist matrikelNr?*/
	private String matrikelNr;
	private String username;
	private String passwort;
	
<<<<<<< .mine
	public User() {}
	public User(String matrikelNr, String username, String passwort) {		

=======
	public User () {}
	public User(String matrikelNr, String username, String passwort) {
		super();
>>>>>>> .theirs
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
