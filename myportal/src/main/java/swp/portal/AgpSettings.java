package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.portal.beans.SystemMB;

import java.util.Collection;

import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the agp-settings template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-settings")
@JsModule("./src/agp-settings.js")
public class AgpSettings extends PolymerTemplate<AgpSettings.AgpSettingsModel> implements BeforeEnterObserver {

	@Id("textAreaEingegangen")
	private TextArea textAreaEingegangen;
	@Id("textAreaAbholen")
	private TextArea textAreaAbholen;
	@Id("textAreaBuchhaltung")
	private TextArea textAreaBuchhaltung;
	@Id("textAreaKunde")
	private TextArea textAreaKunde;
	@Id("comboBoxLoeschen")
	private ComboBox<String> comboBoxLoeschen;
	@Id("buttonLoeschen")
	private Button buttonLoeschen;
	@Id("textFieldHinzufuegen")
	private TextField textFieldHinzufuegen;
	@Id("buttonHinzufuegen")
	private Button buttonHinzufuegen;
	@Id("buttonSpeichern")
	private Button buttonSpeichern;
	
	
	@Inject
	SystemMB systemMB;
	
    public AgpSettings() {
        // You can initialise any data required for the connected UI components here.
    	
    	//todo update 
    	buttonHinzufuegen.addClickListener(e -> {    		
    		systemMB.createKategorie(textFieldHinzufuegen.getValue());
    		comboBoxLoeschen.setItems(systemMB.getKategories());
    	});
    	buttonLoeschen.addClickListener(e -> {    		
    		systemMB.deleteKategorie(comboBoxLoeschen.getValue());
    		comboBoxLoeschen.setItems(systemMB.getKategories());
    	});
    	buttonSpeichern.addClickListener(e -> {    		
    		systemMB.updateEmails(textAreaEingegangen.getValue(), textAreaAbholen.getValue(), textAreaBuchhaltung.getValue(), textAreaKunde.getValue());
    		Notification.show("Emaileinstellungen Gespeichert!");
    	});

    }

    @Override
	public void beforeEnter(BeforeEnterEvent event) {
		comboBoxLoeschen.setItems(systemMB.getKategories());
		textAreaEingegangen.setValue(systemMB.getEmailSchulte());
		textAreaAbholen.setValue(systemMB.getEmailKundeAbholbereit());
		textAreaBuchhaltung.setValue(systemMB.getEmailFIBU());
		textAreaKunde.setValue(systemMB.getEmailKunde());		
	}
    
    
    /**
     * This model binds properties between AgpSettings and agp-settings
     */
    public interface AgpSettingsModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
