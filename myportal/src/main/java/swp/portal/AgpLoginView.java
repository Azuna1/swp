package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-login-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("agp-login-view")
@JsModule("./src/agp-login-view.js")
@Route("Login")
public class AgpLoginView extends PolymerTemplate<AgpLoginView.AgpLoginViewModel> {

	@Id("agpLogin")
	private AgpLogin agpLogin;

	public AgpLoginView() {
		// You can initialise any data required for the connected UI components here.
	}

	/**
	 * This model binds properties between AgpLoginView and agp-login-view
	 */
	public interface AgpLoginViewModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}
}
