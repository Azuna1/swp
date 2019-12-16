package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-shop-liste template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-shop-liste")
@JsModule("./src/agp-shop-liste.js")
@Route("shopListe")
public class AgpShopListe extends PolymerTemplate<AgpShopListe.AgpShopListeModel> {

	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	
	@Id("vaadinSplitLayout1")
	private SplitLayout vaadinSplitLayout1;
	
	@Id("vaadinSplitLayout2")
	private SplitLayout vaadinSplitLayout2;
	
	@Id("vaadinSplitLayout3")
	private SplitLayout vaadinSplitLayout3;
	
	@Id("labelName")
	private Label labelName;
	@Id("labelNameWert")
	private Label labelNameWert;
	@Id("labelPreis")
	private Label labelPreis;
	@Id("labelPreisWert")
	private Label labelPreisWert;
	@Id("labelBeschreibung")
	private Label labelBeschreibung;
	@Id("labelBeschreibungWert")
	private Label labelBeschreibungWert;
	@Id("buttonDetails")
	private Button buttonDetails;



	
	public AgpShopListe() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpShopListe and agp-shop-liste
     */
    public interface AgpShopListeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
