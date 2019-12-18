package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-shop-artikel template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-shop-artikel")
@JsModule("./src/agp-shop-artikel.js")
public class AgpShopArtikel extends PolymerTemplate<AgpShopArtikel.AgpShopArtikelModel> {
	
	
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
    @Id("vaadinHorizontalLayout1")
    private HorizontalLayout vaadinHorizontalLayout1;
    @Id("vaadinHorizontalLayout2")
    private HorizontalLayout vaadinHorizontalLayout2;
    @Id("buttonWarenkorb")
    private Button buttonWarenkorb;
    @Id("labelArtikelname")
    private Label labelArtikelname;
    @Id("labelArtikelnameWert")
    private Label labelArtikelnameWert;
    @Id("labelPreis")
    private Label labelPreis;
    @Id("labelPreisWert")
    private Label labelPreisWert;
    @Id("labelBeschreibung")
    private Label labelBeschreibung;
	
    public AgpShopArtikel() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpShopArtikel and agp-shop-artikel
     */
    public interface AgpShopArtikelModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
