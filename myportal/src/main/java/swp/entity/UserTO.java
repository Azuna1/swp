package swp.entity;

import java.io.Serializable;

import swp.entity.impl.User;

public class UserTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public UserTO() {
	}

	public UserTO(String username) {
		this.name = username;
	}

	public User toUser() {
		return new User(this.getUsername());
	}

	public String getUsername() {
		return name;
	}

}
