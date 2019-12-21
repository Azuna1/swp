package swp.portal.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.vaadin.cdi.annotation.VaadinServiceEnabled;
import com.vaadin.cdi.annotation.VaadinServiceScoped;

import swp.entity.EmailTO;
import swp.entity.GeraetTO;
import swp.entity.KategorieTO;
import swp.entity.RechnungTO;
import swp.entity.UserTO;
import swp.usecase.IEmailManager;
import swp.usecase.IGeraeteManager;
import swp.usecase.IKategorieManager;
import swp.usecase.IRechnungsManager;
import swp.usecase.IUserManager;
import swp.usecase.impl.GeraeteManager;

@ApplicationScoped
public class SystemMB {

	@Inject
	IEmailManager emailManager;
	@Inject
	IKategorieManager kategorieManager;
	@Inject
	IUserManager userManager;
	@Inject
	IRechnungsManager rechnungsManager;
	@Inject
	IGeraeteManager geraeteManager;

	public EmailTO getEmailIT() {
		return emailManager.getEmail("emailIT");
	}
	public EmailTO getEmailFIBU() {
		return emailManager.getEmail("emailFIBU");		
	}
	
	public EmailTO getEmailKundeAbholung() {
		return emailManager.getEmail("emailKundeAbholung");
	}
	
	public EmailTO getEmailKundeEingang() {
		return emailManager.getEmail("emailKundeEingang");
	}
	
	public void saveEmailIT(String toEmail,	String subject , String message) {
		emailManager.editEmail("emailIT", toEmail, subject, message);
	}
	public void saveEmailFIBU(String toEmail,	String subject , String message) {
		emailManager.editEmail("emailFIBU", toEmail, subject, message);
	}
	public void saveEmailKundeAbholung(	String subject , String message) {
		emailManager.editEmail("emailKundeAbholung", "", subject, message);
	}
	public void saveEmailKundeEingang(String subject , String message) {
		emailManager.editEmail("emailKundeEingang", "", subject, message);
	}
	
	
//	"sendmeamailswp2019@gmail.com"
	

	

	

	public Collection<String> getKategories() {
		Collection<String> col = new ArrayList<String>();
		for (KategorieTO katTO : kategorieManager.getKategorien()) {
			col.add(katTO.getName());
		}
		return col;
	}

	public void setRechnungBezahlt(int id)
	{
		RechnungTO rTO = rechnungsManager.getRechnung(id);
		rTO.setIstBezahlt(!rTO.getIstBezahlt());
		rechnungsManager.update(rTO);
	}
	
	public void createKategorie(String name) {
		kategorieManager.createKategorie(name);
	}

	public void deleteKategorie(String name) {
		kategorieManager.deleteKategorie(name);
	}

	public RechnungTO getRechnung(int id) {
		return rechnungsManager.getRechnung(id);
	}
	
	public List<RechnungTO> getRechnungen() {
		return rechnungsManager.getAll();
	}

	public List<RechnungTO> getRechnungenForUser(String matrikelNR) {
		return rechnungsManager.getAllFromUser(matrikelNR);
	}

	public void createRechnung(String matrikelNr, String name, String surname, List<GeraetTO> artikel, HashMap<Integer, Integer> warenkorb) {

		
		for (Map.Entry<Integer, Integer> entry : warenkorb.entrySet()) {
			GeraetTO gTO = geraeteManager.getGeraet(entry.getKey());
			gTO.setAnzahl(gTO.getAnzahl() - entry.getValue());
			geraeteManager.editGeraet(gTO);
		}
		
		rechnungsManager.createRechnung(matrikelNr, name, surname, artikel);
	}
	
	public void delAdmin(String name) {		
			userManager.deleteUser(name);
	}
	
	public void addAdmin(String name) {
		if (!userManager.existUser(name))
			userManager.createUser(name);
	}
	
	public Collection<String> getAdmins() {
		Collection<String> col = new ArrayList<String>();
		for (UserTO userTO : userManager.getAll()) {
			col.add(userTO.getUsername());
		}
		return col;
	}

}
