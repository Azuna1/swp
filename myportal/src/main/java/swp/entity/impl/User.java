package swp.entity.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import swp.entity.UserTO;


@Entity
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true)	
	private String name;
	

	public User() {}
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
