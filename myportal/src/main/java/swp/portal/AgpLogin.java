package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.portal.beans.UserMB;

import java.util.Hashtable;
import java.util.Random;

import javax.inject.Inject;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.AbstractLogin.LoginEvent;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-login template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("agp-login")
@JsModule("./src/agp-login.js")
public class AgpLogin extends PolymerTemplate<AgpLogin.AgpLoginModel> {

	@Id("vaadinLoginForm")
	private LoginForm vaadinLoginForm;

	@Inject
	private UserMB userMB;

	/**
	 * 
	 * Creates a new AgpLogin.
	 */
	public AgpLogin() {
		// You can initialise any data required for the connected UI components here.
		vaadinLoginForm.addLoginListener(e -> login(e));
	}

	/**
	 * This model binds properties between AgpLogin and agp-login
	 */
	public interface AgpLoginModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}

	public void login(LoginEvent event) {
		// TODO
		// just for easier testing

		// testuser2:gJalvqQlCOhi

		// Notification.show("User: " + event.getUsername() + " tried to login");
		// String principalName = "cn=testuser2, ou=People, dc=recodesystems, dc=com";
		String principalName = "cn=" + event.getUsername() + ", ou=People, dc=recodesystems, dc=com";

		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://ldap.recodesystems.com");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, principalName);
		env.put(Context.SECURITY_CREDENTIALS, event.getPassword());

		// TODO
		// just for easier testing
//		userMB.setLoggedIn(true);
//		userMB.setAdmin(true);	
//		UI.getCurrent().navigate("");
//		
//
		try {
			// Connect with ldap
			new InitialLdapContext(env, null);

			userMB.setLoggedIn(true);

			// TODO
			// this is just cause we dont have access to the original LDAP and its structure
			// yet
			if (event.getUsername().contentEquals("testuser2")) {
				userMB.setAdmin(true);
			}
			userMB.setEmail("sendmeamailswp2019@gmail.com");
			userMB.setMatrikelNr(String.format("%d", new Random().nextInt()));
			userMB.setName(String.format("Name%d", new Random().nextInt()));
			userMB.setSurname(String.format("Surname%d", new Random().nextInt()));
			userMB.setUsername(event.getUsername());

			// Auth succeeded
			System.out.println("Login succeeded!");
			UI.getCurrent().navigate("");

		} catch (AuthenticationException er) {
			System.out.println("Login failed!");
			vaadinLoginForm.setEnabled(true);
			Notification.show("User: " + event.getUsername() + " failed to login");
		} catch (NamingException e) {

			// Connection failed
			e.printStackTrace();
			vaadinLoginForm.setEnabled(true);
		}

	}
}
