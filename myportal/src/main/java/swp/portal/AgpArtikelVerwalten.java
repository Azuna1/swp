package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-artikel-verwalten template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-artikel-verwalten")
@JsModule("./src/agp-artikel-verwalten.js")
public class AgpArtikelVerwalten extends PolymerTemplate<AgpArtikelVerwalten.AgpArtikelVerwaltenModel> {

	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("buttonSuchen")
	private Button buttonSuchen;
	@Id("buttonFiltern")
	private Button buttonFiltern;
	@Id("gridArtikel")
	private Grid gridArtikel;
	@Id("buttonBearbeiten")
	private Button buttonBearbeiten;
	
	
    public AgpArtikelVerwalten() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpArtikelVerwalten and agp-artikel-verwalten
     */
    public interface AgpArtikelVerwaltenModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
