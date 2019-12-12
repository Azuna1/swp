package swp.portal;

import javax.inject.Inject;

import com.vaadin.flow.component.button.Button;
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
	
    public MainView() {
        Button button = new Button("Click me",
                event -> UserDAO.doit());
        add(button);
        
        //zum Testen Buttons anlegen
        
        //@Inject
    	GeraeteManager geraeteManager = new GeraeteManager();
    	
        TextField tf1 = new TextField ("Beschreibung");
        TextField tf2 = new TextField("Kategorie");
        TextField tf3 = new TextField("Preis");
        TextField tf4 = new TextField("Geraetename");
        add(tf1, tf2, tf3, tf4);
        /*
        String var1 = tf1.getValue();
        String var2 = tf2.getValue();
        double var3 = Double.valueOf(tf3.getValue());
        String var4 = tf4.getValue();
        */
        
        String var1="0",var2="0",var4="0";
        double var3=0;
        
        Button buttonTest = new Button("testy Send",
                event -> geraeteManager.createGeraet(var1,var2,var3,var4));
        add(buttonTest);
        
    }
    
 
    
    
        
    
    
    
    
}
