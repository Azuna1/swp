package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-artikel-erstellen-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-artikel-erstellen-view")
@JsModule("./src/agp-artikel-erstellen-view.js")
@Route("ArtikelErstellen")
public class AgpArtikelErstellenView extends PolymerTemplate<AgpArtikelErstellenView.AgpArtikelErstellenViewModel> {

	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("agpArtikelErstellen")
	private AgpArtikelErstellen agpArtikelErstellen;
	
	
    public AgpArtikelErstellenView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpArtikelErstellenView and agp-artikel-erstellen-view
     */
    public interface AgpArtikelErstellenViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
