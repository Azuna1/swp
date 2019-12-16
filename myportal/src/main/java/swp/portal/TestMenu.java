package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the test-menu template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-menu")
@JsModule("./src/test-menu.js")
public class TestMenu extends PolymerTemplate<TestMenu.TestMenuModel> {

    @Id("vaadinMenuBar")
	private MenuBar vaadinMenuBar;

	/**
     * Creates a new TestMenu.
     */
    public TestMenu() {
        // You can initialise any data required for the connected UI components here.
    	

    	vaadinMenuBar.setOpenOnHover(true);
    	MenuItem shop = vaadinMenuBar.addItem("Shop");    	
    	MenuItem warenkorb = vaadinMenuBar.addItem("Warenkorb");
    	MenuItem irgendwas = vaadinMenuBar.addItem("irgendwas");
    	
    	SubMenu shopSub = shop.getSubMenu();
    	shopSub.addItem("fancy");
    	
    	vaadinMenuBar.addItem("Sign Out", e -> Notification.show("dummy signout"));
    	
    	
    	
    }

    /**
     * This model binds properties between TestMenu and test-menu
     */
    public interface TestMenuModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
