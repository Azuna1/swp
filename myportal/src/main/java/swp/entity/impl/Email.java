package swp.entity.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import swp.entity.EmailTO;

@Entity
public class Email implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique = true)
	private String name;
	private String toEmail;
	private String message;
	
	public Email() {}
	public Email(String name, String toEmail, String message)
	{
		this.name = name;
		this.toEmail = toEmail;
		this.message = message;
	}
	
	public EmailTO toEmailTO() {
		return new EmailTO(this.name, this.toEmail, this.message);
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
