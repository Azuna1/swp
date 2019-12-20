package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.portal.beans.GeraetMB;
import swp.usecase.IGeraeteManager;

import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-artikel-erstellen template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-artikel-erstellen")
@JsModule("./src/agp-artikel-erstellen.js")
public class AgpArtikelErstellen extends PolymerTemplate<AgpArtikelErstellen.AgpArtikelErstellenModel> implements BeforeEnterObserver {


	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("textFieldArtikelname")
	private TextField textFieldArtikelname;
	@Id("textFieldPreis")
	private TextField textFieldPreis;
	@Id("comboBoxKategorie")
	private ComboBox<String> comboBoxKategorie;
	@Id("comboBoxAnzahl")
	private ComboBox<Integer> comboBoxAnzahl;
	@Id("textAreaArtikelbeschreibung")
	private TextArea textAreaArtikelbeschreibung;
	@Id("buttonSpeichern")
	private Button buttonSpeichern;
	@Id("buttonLoeschen")
	private Button buttonLoeschen;
	
	@Inject
	GeraetMB geraetMB;
	
	@Inject
	IGeraeteManager geraetManager;
    /**
     * Creates a new AgpArtikelErstellen.
     */
    public AgpArtikelErstellen() {
        // You can initialise any data required for the connected UI components here.
    	buttonSpeichern.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    	buttonLoeschen.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    	
    	for (int i = 0; i <= 100; i++)
    		comboBoxAnzahl.setItems(i);
    	
    	buttonSpeichern.addClickListener(event -> {
    		for (int i = 0; i < comboBoxAnzahl.getValue();i++)
    			geraetMB.createGeraet(textAreaArtikelbeschreibung.getValue(), comboBoxKategorie.getValue(), Double.valueOf(textFieldPreis.getValue()), textFieldArtikelname.getValue());
    	});
    	
    	buttonLoeschen.addClickListener(event -> {
    		textAreaArtikelbeschreibung.setValue("");
    		comboBoxKategorie.setValue("");
    		textFieldPreis.setValue("");
    		textFieldArtikelname.setValue("");
    		comboBoxAnzahl.setValue(0);
    	});
    }

    @Override
	public void beforeEnter(BeforeEnterEvent event) {
		//TODO kategorien füllen
		
	}
    
    /**
     * This model binds properties between AgpArtikelErstellen and agp-artikel-erstellen
     */
    public interface AgpArtikelErstellenModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
