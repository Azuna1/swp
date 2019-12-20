package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.portal.beans.UserMB;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;

/**
 * A Designer generated component for the agp-menu template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("agp-menu")
@JsModule("./src/agp-menu.js")
public class AgpMenu extends PolymerTemplate<AgpMenu.AgpMenuModel> implements BeforeEnterObserver {

	@Id("vaadinMenuBar")
	private MenuBar vaadinMenuBar;

	@Inject
	private UserMB userMB;

	MenuItem artikelErstellen;
	MenuItem artikelVerwalten;
	MenuItem settings;

	/**
	 * Creates a new AgpMenu.
	 */
	public AgpMenu() {

		vaadinMenuBar.setOpenOnHover(true);
		MenuItem shop = vaadinMenuBar.addItem("Shop", e -> UI.getCurrent().navigate("Shop"));
		MenuItem warenkorb = vaadinMenuBar.addItem("Warenkorb", e -> UI.getCurrent().navigate("Warenkorb"));
		MenuItem bestellungenVerwalten = vaadinMenuBar.addItem("Bestellungen Verwalten",
				e -> UI.getCurrent().navigate("BestellungenVerwalten"));
		//MenuItem kasse = vaadinMenuBar.addItem("Kasse", e -> UI.getCurrent().navigate("Kasse"));

		artikelErstellen = vaadinMenuBar.addItem("Artikel Erstellen",
				e -> UI.getCurrent().navigate("ArtikelErstellen"));
		artikelErstellen.setVisible(false);
		artikelVerwalten = vaadinMenuBar.addItem("Artikel Verwalten",
				e -> UI.getCurrent().navigate("ArtikelVerwalten"));
		artikelVerwalten.setVisible(false);
		settings = vaadinMenuBar.addItem("Settings", e -> UI.getCurrent().navigate("Settings"));
		settings.setVisible(false);

		MenuItem logout = vaadinMenuBar.addItem("Logout", e -> {
			userMB.setLoggedIn(false);
			UI.getCurrent().navigate("Login");
			Notification.show("User logged out!");
		});

	}
	

	@PostConstruct
	public void showAdminMenu() {
		if(!userMB.isLoggedIn())
			UI.getCurrent().navigate("");
		if (userMB.isAdmin()) {
			artikelErstellen.setVisible(true);
			artikelVerwalten.setVisible(true);
			settings.setVisible(true);
		}
	}

	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		if(!userMB.isLoggedIn())
			event.forwardTo("Login");
		
	}
	
	/**
	 * This model binds properties between AgpMenu and agp-menu
	 */
	public interface AgpMenuModel extends TemplateModel {
		// Add setters and getters for template properties here.

	}



}
