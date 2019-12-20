package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the agp-warenkorb-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-warenkorb-view")
@JsModule("./src/agp-warenkorb-view.js")
@Route("Warenkorb")
public class AgpWarenkorbView extends PolymerTemplate<AgpWarenkorbView.AgpWarenkorbViewModel> {

	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("vaadinGrid")
	private Grid vaadinGrid;
	@Id("buttonKaufen")
	private Button buttonKaufen;
	@Id("textSumme")
	private Label textSumme;
	public AgpWarenkorbView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpWarenkorbView and agp-warenkorb-view
     */
    public interface AgpWarenkorbViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
