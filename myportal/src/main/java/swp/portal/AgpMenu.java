package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the agp-menu template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-menu")
@JsModule("./src/agp-menu.js")
public class AgpMenu extends PolymerTemplate<AgpMenu.AgpMenuModel> {
	
    @Id("vaadinMenuBar")
	private MenuBar vaadinMenuBar;

    /**
     * Creates a new AgpMenu.
     */
    public AgpMenu() {
    	
    	vaadinMenuBar.setOpenOnHover(true);
    	MenuItem shop = vaadinMenuBar.addItem("Shop");    	
    	MenuItem warenkorb = vaadinMenuBar.addItem("Warenkorb");
    	MenuItem bestellungenVerwalten = vaadinMenuBar.addItem("Bestellungen Verwalten");
    	MenuItem kasse = vaadinMenuBar.addItem("Kasse"); 
    	MenuItem logout = vaadinMenuBar.addItem("Logout");
    	
    	
//    	SubMenu shopSub = shop.getSubMenu();
//    	shopSub.addItem("fancy");
//    	
//    	vaadinMenuBar.addItem("Sign Out", e -> Notification.show("dummy signout"));
    	
    }

    /**
     * This model binds properties between AgpMenu and agp-menu
     */
    public interface AgpMenuModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
