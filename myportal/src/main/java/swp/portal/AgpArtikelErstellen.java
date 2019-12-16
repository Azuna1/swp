package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-artikel-erstellen template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-artikel-erstellen")
@JsModule("./src/agp-artikel-erstellen.js")
@Route("artikelErstellen")
public class AgpArtikelErstellen extends PolymerTemplate<AgpArtikelErstellen.AgpArtikelErstellenModel> {

	@Id("vaadinMenuBarAdmin")
	private AgpMenuAdmin agpMenuAdmin;
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("textFieldArtikelname")
	private TextField textFieldArtikelname;
	@Id("textFieldPreis")
	private TextField textFieldPreis;
	@Id("comboBoxKategorie")
	private ComboBox comboBoxKategorie;
	@Id("comboBoxAnzahl")
	private ComboBox comboBoxAnzahl;
	@Id("textAreaArtikelbeschreibung")
	private TextArea textAreaArtikelbeschreibung;
	@Id("buttonSpeichern")
	private Button buttonSpeichern;
	@Id("buttonLoeschen")
	private Button buttonLoeschen;
	
	
    /**
     * Creates a new AgpArtikelErstellen.
     */
    public AgpArtikelErstellen() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AgpArtikelErstellen and agp-artikel-erstellen
     */
    public interface AgpArtikelErstellenModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
