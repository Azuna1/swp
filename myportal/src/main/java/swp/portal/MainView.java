package swp.portal;

import javax.inject.Inject;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import swp.dao.UserDAO;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow with CDI", shortName = "Project Base")
public class MainView extends VerticalLayout {

	@Inject
    private MessageBean messageBean;
	
    public MainView() {
        Button button = new Button("Click me",
                event -> UserDAO.doit());
        add(button);
    }
    
    //zum Testen Buttons anlegen
    
    
}
