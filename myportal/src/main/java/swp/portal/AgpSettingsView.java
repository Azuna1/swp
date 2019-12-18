package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-settings-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-settings-view")
@JsModule("./src/agp-settings-view.js")
@Route("Settings")
public class AgpSettingsView extends PolymerTemplate<AgpSettingsView.AgpSettingsViewModel> {

    @Id("vaadinVerticalLayout")
    private VerticalLayout vaadinVerticalLayout;
    @Id("agpMenu")
    private AgpMenu agpMenu;
    @Id("agpSettings")
    private AgpSettings agpSettings;
	
	
    public AgpSettingsView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpSettingsView and agp-settings-view
     */
    public interface AgpSettingsViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
