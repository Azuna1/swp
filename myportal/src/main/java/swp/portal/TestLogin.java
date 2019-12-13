package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.login.AbstractLogin.LoginEvent;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the test-login template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-login")
@JsModule("./src/test-login.js")
public class TestLogin extends PolymerTemplate<TestLogin.TestLoginModel> {

    @Id("vaadinLoginForm")
	private LoginForm vaadinLoginForm;

	/**
     * Creates a new TestLogin.
     */
    public TestLogin() {
        // You can initialise any data required for the connected UI components here.
    	vaadinLoginForm.addLoginListener(e -> login(e));

    }

    /**
     * This model binds properties between TestLogin and test-login
     */
    public interface TestLoginModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
    
    public void login(LoginEvent event) { 
    	Notification.show("User: " + event.getUsername() + " tried to login with password: " + event.getPassword());
    	System.out.println("User: " + event.getUsername() + " tried to login with password: " + event.getPassword());
    	
    }


}
