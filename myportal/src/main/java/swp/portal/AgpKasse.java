package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-kasse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-kasse")
@JsModule("./src/agp-kasse.js")
public class AgpKasse extends PolymerTemplate<AgpKasse.AgpKasseModel> {

	
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("labelRechnungsnummer")
	private Label labelRechnungsnummer;
	@Id("labelMatrikelnummer")
	private Label labelMatrikelnummer;
	@Id("labelName")
	private Label labelName;
	@Id("labelArtikelliste")
	private Label labelArtikelliste;
	@Id("gridArtikelliste")
	private Grid gridArtikelliste;
	@Id("labelGesamtpreis")
	private Label labelGesamtpreis;
	@Id("buttonBestellen")
	private Button buttonBestellen;
	@Id("labelUeberweisung")
	private Label labelUeberweisung;
	
	
    /**
     * Creates a new AgpKasse.
     */
    public AgpKasse() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpKasse and agp-kasse
     */
    public interface AgpKasseModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
