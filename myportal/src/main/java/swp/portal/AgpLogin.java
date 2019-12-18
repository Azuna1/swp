package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;

import com.vaadin.flow.component.Tag;
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
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-login")
@JsModule("./src/agp-login.js")
public class AgpLogin extends PolymerTemplate<AgpLogin.AgpLoginModel> {

    @Id("vaadinLoginForm")
	private LoginForm vaadinLoginForm;
	
    /**
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
    	Notification.show("User: " + event.getUsername() + " tried to login with password: " + event.getPassword());
    	System.out.println("User: " + event.getUsername() + " tried to login with password: " + event.getPassword());
    	
    	
    	//String principalName = "cn=testuser3, ou=People, dc=recodesystems, dc=com";
    	String principalName = "cn=" + event.getUsername() + ", ou=People, dc=recodesystems, dc=com";
    	
    	
    	Hashtable<String, String> env = new Hashtable<String, String>();
    	env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    	env.put(Context.PROVIDER_URL, "ldap://ldap.recodesystems.com");
    	env.put(Context.SECURITY_AUTHENTICATION, "simple");
    	env.put(Context.SECURITY_PRINCIPAL, principalName);
    	env.put(Context.SECURITY_CREDENTIALS, event.getPassword());

    	try {
    	            //Connect with ldap
    	            new InitialLdapContext(env, null);  

    	            //Connection succeeded
    	            System.out.println("Login succeeded!");
    	        } catch (NamingException e) {

    	            //Connection failed
    	            System.out.println("Login failed!");
    	            e.printStackTrace();
    	        }  
    	
    	
    	
    	
    	
    	
    }
}
