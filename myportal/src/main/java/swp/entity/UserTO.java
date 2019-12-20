package swp.entity;

import java.io.Serializable;



public class UserTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private String name;
	

	public UserTO() {}
	public UserTO(String username) {	
		this.name = username;
	}
	
	
	public String getUsername() {
		return name;
	}

}
