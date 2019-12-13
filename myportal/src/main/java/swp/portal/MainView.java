package swp.portal;

import javax.inject.Inject;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import antlr.debug.Event;
import swp.dao.UserDAO;
import swp.usecase.impl.GeraeteManager;

/**
 * The main view contains a button and a click listener.
 */


@Route("")
@PWA(name = "Project Base for Vaadin Flow with CDI", shortName = "Project Base")
public class MainView extends VerticalLayout {

	@Inject
    private MessageBean messageBean;
	@Inject 
	private GeraetMB geraetMB;
	
    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show( messageBean.getMessage()));
        add(button);
        
        //zum Testen Buttons anlegen
        
        
    	
        TextField tf1 = new TextField ("Beschreibung");
        TextField tf2 = new TextField("Kategorie");
        TextField tf3 = new TextField("Preis");
        TextField tf4 = new TextField("Geraetename");
        add(tf1, tf2, tf3, tf4);
        

        
        
        
        
        Button buttonTest = new Button("testy Send",
                event -> geraetMB.createGeraet(tf1.getValue(),tf2.getValue(),Double.valueOf(tf3.getValue()),tf4.getValue()));
        add(buttonTest);
        
    }
    
 
    
    
        
    
    
    
    
}
