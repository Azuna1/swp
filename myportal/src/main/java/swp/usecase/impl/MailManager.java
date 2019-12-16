package swp.usecase.impl;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Stateless
public class MailManager {

	protected Session mailSession;	
	
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
	
	public void sendMail(String message) throws MessagingException, UnsupportedEncodingException {
		
		String toFibu ="refstylelt@googlemail.com";
		String toStudentString ="refstylelt@googlemail.com"; //Email muss aus dem LDAP kommen...
		String toAdminString ="refstylelt@googlemail.com";
		String absenderEmail ="sendmeamailswp2019@gmail.com";
		String absenderName ="Mail Man";
		String subject = "TestMail";
		//String message = "";
		
		if(mailSession == null) {
			loginToMail();
		}
		MimeMessage msg = new MimeMessage(mailSession);
		msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
		msg.addHeader("Content-Transfer-Encoding", "8bit");
		
		msg.setFrom(new InternetAddress(absenderEmail, absenderName));
		msg.setReplyTo(InternetAddress.parse(absenderEmail, false));
		msg.setSubject(subject,"UTF-8");
		msg.setText(message,"UTF-8");
		msg.setSentDate(new Date());
		
		//Angabe,wohin die Mail(s) hingesendet werden sollen -> auch mehrere Nennungen möglich
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toFibu, false));
	
		System.out.println("Versende EMail an: "+toFibu);
		
		Transport.send(msg);
		System.out.println("Email wurde versandt! ");
	}
	
}
