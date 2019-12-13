package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import swp.portal.TestLogin;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import swp.portal.TestMenu;

/**
 * A Designer generated component for the test-sample-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-sample-view")
@JsModule("./src/test-sample-view.js")
@Route("sample")
public class TestSampleView extends PolymerTemplate<TestSampleView.TestSampleViewModel> {

    @Id("testLogin")
	private TestLogin testLogin;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("testMenu")
	private TestMenu testMenu;

	/**
     * Creates a new TestSampleView.
     */
    public TestSampleView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between TestSampleView and test-sample-view
     */
    public interface TestSampleViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
