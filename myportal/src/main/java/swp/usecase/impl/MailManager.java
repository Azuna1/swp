package swp.usecase.impl;

import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.*;

import javax.jms.Session;

//@Stateless
public class MailManager {

	String toFibu ="refstylelt@googlemail.com";
	String toStudentString ="refstylelt@googlemail.com";
	String toAdminString ="refstylelt@googlemail.com";
	
	
	final String userName ="sendmeamailswp2019";
	final String password ="Softwareprojekt2019!";
	
	String host ="smtp.gmail.com";
	String port="587";
	
	Properties props = new Properties();
	props.put("mail.smtp.auth","true");
	props.put("mail.smtp.starttls.enable","true");
	props.put("mail.smtp.host",host);
	props.put("mail.smtp.port",port);
	
	//Session erstellen
	
	Session session = Session.getInstance(props,new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(userName, password);
		}
	});
	//Message an sich -> auch in Strings packen -> 3verschiedene je nach Usecase
	
	
	
}
