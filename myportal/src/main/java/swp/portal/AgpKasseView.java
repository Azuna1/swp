package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-kasse-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-kasse-view")
@JsModule("./src/agp-kasse-view.js")
@Route("Kasse")
public class AgpKasseView extends PolymerTemplate<AgpKasseView.AgpKasseViewModel> {

	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("agpKasse")
	private AgpKasse agpKasse;
	
    public AgpKasseView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpKasseView and agp-kasse-view
     */
    public interface AgpKasseViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
