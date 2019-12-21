package swp.usecase.impl;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import swp.dao.EmailDAO;
import swp.entity.EmailTO;
import swp.entity.impl.Email;
import swp.usecase.IEmailManager;

@Stateless
public class EmailManager implements IEmailManager{
	
	@Inject
	EmailDAO emailDAO;
	
	private Session mailSession;

	@Override
	public void createEmail(String name, String toEmail,String subject, String message) {
		Email mail = new Email(name, toEmail, subject, message);
		emailDAO.save(mail);
		
	}

	@Override
	public void deleteEmail(String name) {
		emailDAO.delete(name);
		
	}

	@Override
	public void editEmail(String name, String toEmail, String subject, String message) {
		Email mail = emailDAO.find(name);
		if(mail == null) {
			createEmail(name, toEmail, subject, message);
			return;
		}
		mail.setToEmail(toEmail);
		mail.setSubject(subject);
		mail.setMessage(message);
		emailDAO.update(mail);
		
	}

	@Override
	public EmailTO getEmail(String name) {		
		Email mail = emailDAO.find(name);
		return (mail  == null) ? new EmailTO() : mail.toEmailTO();
		
	}

	@Override
	public boolean sendEmail(String name) {
		Email mail = emailDAO.find(name);
		String absenderEmail ="sendmeamailswp2019@gmail.com";
		String absenderName ="AltegrätePortal";
		
		if(mailSession == null) {
			loginToMail();
		}
		
		try {
		MimeMessage msg = new MimeMessage(mailSession);
		msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
		msg.addHeader("Content-Transfer-Encoding", "8bit");
		
		msg.setFrom(new InternetAddress(absenderEmail, absenderName));
		msg.setReplyTo(InternetAddress.parse(absenderEmail, false));
		msg.setSubject(mail.getName(),"UTF-8");
		msg.setText(mail.getMessage(),"UTF-8");
		msg.setSentDate(new Date());		

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail.getToEmail(), false));
	
		System.out.println("Versende EMail an: " + mail.getToEmail());
		
		
			Transport.send(msg);
			return true;
		} catch (MessagingException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	
	public void loginToMail() {
		
	//login Daten sollten irgendwo hin outgesourced werden!!
	final String userName ="sendmeamailswp2019@gmail.com";
	final String password ="Softwareprojekt2019!";
	
	String host ="smtp.gmail.com";
	String port="465"; //SSL Port
	
	Properties props = new Properties();
	props.put("mail.smtp.auth","true");
	props.put("mail.smtp.socketFactory.port",port);
	props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.host",host);
	props.put("mail.smtp.port",port);
	
	Authenticator auth = new Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(userName, password);
		}
	};
	
	this.mailSession = Session.getDefaultInstance(props, auth);
	System.out.println("Login erfolgreich!!!");
	
	}
	
	
	

}
