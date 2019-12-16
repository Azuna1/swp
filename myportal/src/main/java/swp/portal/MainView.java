<<<<<<< HEAD
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
import swp.portal.beans.GeraetMB;
import swp.portal.beans.MessageBean;
import swp.usecase.impl.GeraeteManager;

/**
 * The main view contains a button and a click listener.
 */


@Route("1")
@PWA(name = "Project Base", shortName = "Project Base")
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
=======
package swp.portal;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.mail.MessagingException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import antlr.debug.Event;
import swp.dao.UserDAO;
import swp.portal.beans.GeraetMB;
import swp.portal.beans.MessageBean;
import swp.usecase.impl.GeraeteManager;
import swp.usecase.impl.MailManager;

/**
 * The main view contains a button and a click listener.
 */


@Route("")
@PWA(name = "Project Base", shortName = "Project Base")
public class MainView extends VerticalLayout {

	@Inject
    private MessageBean messageBean;
	@Inject 
	private GeraetMB geraetMB;
	
    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show( messageBean.getMessage()));
        add(button);
        
//        //TesField f�r Create Geraete
//        
//        
//    	
//        TextField tf1 = new TextField ("Beschreibung");
//        TextField tf2 = new TextField("Kategorie");
//        TextField tf3 = new TextField("Preis");
//        TextField tf4 = new TextField("Geraetename");
//        add(tf1, tf2, tf3, tf4);
//         
//        
//        Button buttonTest = new Button("testy Send",
//                event -> geraetMB.createGeraet(tf1.getValue(),tf2.getValue(),Double.valueOf(tf3.getValue()),tf4.getValue()));
//        add(buttonTest);
//        
        
        // Mail Testing Zone ^-^
        TextField tf1 = new TextField ("Message");
        add(tf1);
        MailManager mailManager = new MailManager();
        String message;
        message=tf1.getValue();
        
        
        Button b1 = new Button("Login on SMTP",
        	Event -> {	
        		mailManager.loginToMail();
        		
        	});
        
      Button b2 = new Button("versende mich",
      event -> {
		try {
			//Send der Email
			mailManager.sendMail(message);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
      add(b1,b2);
        	}
    }

>>>>>>> c7e410e265b6510fddbdd03c70538118932821f5
