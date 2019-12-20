package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-bestellungen-verwalten-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-bestellungen-verwalten-view")
@JsModule("./src/agp-bestellungen-verwalten-view.js")
@Route("BestellungenVerwalten")
public class AgpBestellungenVerwaltenView extends PolymerTemplate<AgpBestellungenVerwaltenView.AgpBestellungenVerwaltenViewModel> {

    @Id("agpMenu")
    private AgpMenu agpMenu;
    public AgpBestellungenVerwaltenView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpBestellungenVerwaltenView and agp-bestellungen-verwalten-view
     */
    public interface AgpBestellungenVerwaltenViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
