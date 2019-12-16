package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-warenkorb template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-warenkorb")
@JsModule("./src/agp-warenkorb.js")
@Route("warenkorb")
public class AgpWarenkorb extends PolymerTemplate<AgpWarenkorb.AgpWarenkorbModel> {

	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("vaadinGrid")
	private Grid vaadinGrid;
	@Id("buttonKaufen")
	private Button buttonKaufen;
	@Id("labelGesamtPreis")
	private Label labelGesamtPreis;
	
    public AgpWarenkorb() {
        // You can initialise any data required for the connected UI components here.
    	
//        vaadinGrid.addColumn(WarenkorbTO??::getName).setHeader("Artikel");
//        vaadinGrid.addColumn(??::getAnzahl).setHeader("Anzahl");
//        vaadinGrid.addColumn(??::getEinzelpreis).setHeader("Einzelpreis");
//        vaadinGrid.addColumn(??::getGesamtpreis).setHeader("Gesamtpreis");
//        vaadinGrid.addColumn(??::getLoeschen).setHeader("Loeschen");
    	
    }
    
    

    /**
     * This model binds properties between AgpWarenkorb and agp-warenkorb
     */
    public interface AgpWarenkorbModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
