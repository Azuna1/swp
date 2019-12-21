package swp.usecase;

import javax.ejb.Local;

import swp.entity.EmailTO;

@Local
public interface IEmailManager {
	public void createEmail(String name, String toEmail, String subject, String message);
	public void deleteEmail(String name);
	public void editEmail(String name, String toEmail, String subject, String message);
	public EmailTO getEmail(String name);
	public boolean sendEmail(String name);
}
