package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-shop-artikel-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-shop-artikel-view")
@JsModule("./src/agp-shop-artikel-view.js")
@Route("ShopArtikel")
public class AgpShopArtikelView extends PolymerTemplate<AgpShopArtikelView.AgpShopArtikelViewModel> {

	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("agpShopArtikel")
	private AgpShopArtikel agpShopArtikel;
	
    public AgpShopArtikelView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpShopArtikelView and agp-shop-artikel-view
     */
    public interface AgpShopArtikelViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
