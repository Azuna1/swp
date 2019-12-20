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
	
	private ArrayList<EmailTO> emailTOs = new ArrayList<>();
	
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
