package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import swp.portal.AgpMenu;

/**
 * A Designer generated component for the agp-shop-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-shop-view")
@JsModule("./src/agp-shop-view.js")
@Route("shop")
public class AgpShopView extends PolymerTemplate<AgpShopView.AgpShopViewModel> {
	
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("vaadinComboBox")
	private ComboBox vaadinComboBox;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;



	/**
     * Creates a new AgpShopView.
     */
    public AgpShopView() {
        // You can initialise any data required for the connected UI components here.
        
    	
    }

    /**
     * This model binds properties between AgpShopView and agp-shop-view
     */
    public interface AgpShopViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
