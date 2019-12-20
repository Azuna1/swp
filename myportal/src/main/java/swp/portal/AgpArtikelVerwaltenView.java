package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import swp.portal.AgpMenu;


/**
 * A Designer generated component for the agp-artikel-verwalten-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-artikel-verwalten-view")
@JsModule("./src/agp-artikel-verwalten-view.js")
@Route("ArtikelVerwalten")
public class AgpArtikelVerwaltenView extends PolymerTemplate<AgpArtikelVerwaltenView.AgpArtikelVerwaltenViewModel> {

	@Id("agpMenu")
	private AgpMenu agpMenu;
	public AgpArtikelVerwaltenView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpArtikelVerwaltenView and agp-artikel-verwalten-view
     */
    public interface AgpArtikelVerwaltenViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
