package swp.portal.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.vaadin.cdi.annotation.VaadinServiceEnabled;
import com.vaadin.cdi.annotation.VaadinServiceScoped;

import swp.entity.EmailTO;
import swp.entity.KategorieTO;
import swp.usecase.IEmailManager;
import swp.usecase.IKategorieManager;
import swp.usecase.IUserManager;

@ApplicationScoped
public class SystemMB {
	
	@Inject
	IEmailManager emailManager;
	@Inject
	IKategorieManager kategorieManager;
	@Inject
	IUserManager userManager;	
	
	
	private String mailSchulte = "Rechnung beglichen";
	private String mailSchulteEmail = "sendmeamailswp2019@gmail.com"; 	//TODO dummy email
	private String mailKundeAbholbereit = "Einkauf bereit zur Abholung";
	private String mailFIBU = "Neuer Auftrag";
	private String mailFIBUEmail = "sendmeamailswp2019@gmail.com";		//TODO dummy email
	private String mailKunde = "Vielen Dank für ihren Einkauf";
	
	public void updateEmails(String msgSchulte, String msgKundeAbholbereit, String msgFIBU, String msgKunde) {

		emailManager.editEmail(mailSchulte, mailSchulteEmail, "", msgSchulte);
		emailManager.editEmail(mailFIBU, mailFIBUEmail, "", msgFIBU);
		emailManager.editEmail(mailKundeAbholbereit, "" , "", msgKundeAbholbereit);
		emailManager.editEmail(mailKunde,"" , "", msgKunde);
		
	}
	
	public String getEmailSchulte() {
		return emailManager.getEmail(mailSchulte).getMessage();
	}
	public String getEmailKundeAbholbereit() {
		return emailManager.getEmail(mailKundeAbholbereit).getMessage();
	}
	public String getEmailFIBU() {
		return emailManager.getEmail(mailFIBU).getMessage();
	}
	public String getEmailKunde() {
		return emailManager.getEmail(mailKunde).getMessage();
	}
	
	public Collection<String> getKategories() {
		Collection<String> col = new ArrayList<String>();
		for (KategorieTO katTO : kategorieManager.getKategorien()) {
			col.add(katTO.getName());
		}
		return col;	
	}
	
	public void createKategorie(String name){
		kategorieManager.createKategorie(name);
	}
	
	public void deleteKategorie(String name) {
		kategorieManager.deleteKategorie(name);
	}


}
