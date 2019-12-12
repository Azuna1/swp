package swp.portal;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.mail.MessagingException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import antlr.debug.Event;
import swp.dao.UserDAO;
import swp.usecase.impl.GeraeteManager;
import swp.usecase.impl.MailManager;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow with CDI", shortName = "Project Base")
public class MainView extends VerticalLayout {

	@Inject
    private MessageBean messageBean;
	
    public MainView() {
//        Button button = new Button("Click me",
//                event -> UserDAO.doit());
//        add(button);
        
        //TesField für Create Geraete
        
//        //@Inject
//    	GeraeteManager geraeteManager = new GeraeteManager();
//    	
//        TextField tf1 = new TextField ("Beschreibung");
//        TextField tf2 = new TextField("Kategorie");
//        TextField tf3 = new TextField("Preis");
//        TextField tf4 = new TextField("Geraetename");
//        add(tf1, tf2, tf3, tf4);
//        
//        String var1 = tf1.getValue();
//        String var2 = tf2.getValue();
//        double var3 = Double.valueOf(tf3.getValue());
//        String var4 = tf4.getValue();
//        
//        Button buttonTest = new Button("testy Send",
//                event -> geraeteManager.createGeraet(var1,var2,var3,var4));
//        add(buttonTest);
//     
        
     // Mail Testing Zone ^-^
        TextField tf1 = new TextField ("Message");
        add(tf1);
        MailManager mailManager = new MailManager();
        String message;
        message=tf1.getValue();
        
      //Login aufm SMTP von Google
        
        
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

