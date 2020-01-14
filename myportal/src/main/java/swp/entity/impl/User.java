package swp.entity.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import swp.entity.UserTO;

// warning / error shown  (The given name of the entity User is empty) is a bug with eclipse and JPA / Hibernate
// https://stackoverflow.com/questions/17675964/the-given-name-of-the-entity-classname-is-empty/21979815
// https://issues.redhat.com/browse/JBJPA-40
@Entity 
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true)
	private String name;

	public User() {
	}

	public User(String username) {
		this.name = username;
	}

	public UserTO toUserTO() {
		return new UserTO(this.getUsername());
	}

	public String getUsername() {
		return name;
	}

}
