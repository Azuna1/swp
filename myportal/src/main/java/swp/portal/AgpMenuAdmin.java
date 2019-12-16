package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the agp-menu-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-menu-admin")
@JsModule("./src/agp-menu-admin.js")
public class AgpMenuAdmin extends PolymerTemplate<AgpMenuAdmin.AgpMenuAdminModel> {

	@Id("vaadinMenuBarAdmin")
	private MenuBar vaadinMenuBarAdmin;
	
    /**
     * Creates a new AgpMenuAdmin.
     */
    public AgpMenuAdmin() {
        // You can initialise any data required for the connected UI components here.
    	
    	vaadinMenuBarAdmin.setOpenOnHover(true);
    	MenuItem shop = vaadinMenuBarAdmin.addItem("Shop");    	
    	MenuItem warenkorb = vaadinMenuBarAdmin.addItem("Warenkorb");
    	MenuItem artikelErstellen = vaadinMenuBarAdmin.addItem("Artikel Erstellen");
    	MenuItem artikelVerwalten = vaadinMenuBarAdmin.addItem("Artikel Verwalten"); 
    	MenuItem bestellungenVerwalten = vaadinMenuBarAdmin.addItem("Bestellungen Verwalten");
    	MenuItem settings = vaadinMenuBarAdmin.addItem("Settings");
    	MenuItem logout = vaadinMenuBarAdmin.addItem("Logout");
    }

    /**
     * This model binds properties between AgpMenuAdmin and agp-menu-admin
     */
    public interface AgpMenuAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
