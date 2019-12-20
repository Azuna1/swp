package swp.entity;

import java.io.Serializable;

public class EmailTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String toEmail;
	private String message;
	
	public EmailTO() {}
	public EmailTO(String name, String toEmail, String message)
	{
		this.name = name;
		this.toEmail = toEmail;
		this.message = message;
	}
	
	
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
