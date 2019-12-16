package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-bestellungen-verwalten template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-bestellungen-verwalten")
@JsModule("./src/agp-bestellungen-verwalten.js")
@Route("bestellungenVerwalten")
public class AgpBestellungenVerwalten extends PolymerTemplate<AgpBestellungenVerwalten.AgpBestellungenVerwaltenModel> {
	
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("gridBestellungen")
	private Grid gridBestellungen;
    /**
     * Creates a new AgpBestellungenVerwalten.
     */
    public AgpBestellungenVerwalten() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpBestellungenVerwalten and agp-bestellungen-verwalten
     */
    public interface AgpBestellungenVerwaltenModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
