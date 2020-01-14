package swp.portal;

import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.templatemodel.TemplateModel;

import swp.entity.EmailTO;
import swp.portal.beans.SystemMB;
import swp.portal.beans.UserMB;

/**
 * A Designer generated component for the agp-settings template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("agp-settings")
@JsModule("./src/agp-settings.js")
public class AgpSettings extends PolymerTemplate<AgpSettings.AgpSettingsModel> implements BeforeEnterObserver {
	private static final long serialVersionUID = 0xDEADBEEF;
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
	@Id("buttonAdminAdd")
	private Button buttonAdminAdd;
	@Id("buttonAdminDelete")
	private Button buttonAdminDelete;
	@Id("comboBoxAdminDelete")
	private ComboBox<String> comboBoxAdminDelete;
	@Id("textFieldAdminName")
	private TextField textFieldAdminName;
	@Id("textFieldBetreffKauf")
	private TextField textFieldBetreffKauf;
	@Id("textFieldBetreffAbhol")
	private TextField textFieldBetreffAbhol;
	@Id("textFieldBetreffFIBU")
	private TextField textFieldBetreffFIBU;
	@Id("textFieldMailFIBU")
	private TextField textFieldMailFIBU;
	@Id("textFieldMailIT")
	private TextField textFieldMailIT;
	@Id("textFieldBetreffIT")
	private TextField textFieldBetreffIT;

	@Inject
	SystemMB systemMB;
	@Inject
	UserMB userMB;

	public AgpSettings() {
		// You can initialise any data required for the connected UI components here.

		// todo update
		buttonHinzufuegen.addClickListener(e -> {
			systemMB.createKategorie(textFieldHinzufuegen.getValue());
			comboBoxLoeschen.setItems(systemMB.getKategories());
			Notification.show("Gespeichert!");
		});
		buttonLoeschen.addClickListener(e -> {
			systemMB.deleteKategorie(comboBoxLoeschen.getValue());
			comboBoxLoeschen.setItems(systemMB.getKategories());
			Notification.show("Gespeichert!");
		});
		buttonSpeichern.addClickListener(e -> {
			// TODO alle felder
			systemMB.saveEmailFIBU(textFieldMailFIBU.getValue(), textFieldBetreffFIBU.getValue(),
					textAreaBuchhaltung.getValue());
			systemMB.saveEmailIT(textFieldMailIT.getValue(), textFieldBetreffIT.getValue(),
					textAreaEingegangen.getValue());
			systemMB.saveEmailKundeAbholung(textFieldBetreffAbhol.getValue(), textAreaAbholen.getValue());
			systemMB.saveEmailKundeEingang(textFieldBetreffKauf.getValue(), textAreaKunde.getValue());
			Notification.show("Emaileinstellungen Gespeichert!");
		});

		buttonAdminAdd.addClickListener(e -> {
			systemMB.addAdmin(textFieldAdminName.getValue());
			comboBoxAdminDelete.setItems(systemMB.getAdmins());
			Notification.show("Gespeichert!");
		});
		buttonAdminDelete.addClickListener(e -> {
			systemMB.delAdmin(comboBoxAdminDelete.getValue());
			comboBoxAdminDelete.setItems(systemMB.getAdmins());
			Notification.show("Gespeichert!");
		});

	}

	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		comboBoxLoeschen.setItems(systemMB.getKategories());
		EmailTO mail = systemMB.getEmailIT();

		textFieldMailIT.setValue(mail.getToEmail());
		textFieldBetreffIT.setValue(mail.getSubject());
		textAreaEingegangen.setValue(mail.getMessage());

		mail = systemMB.getEmailFIBU();
		textFieldMailFIBU.setValue(mail.getToEmail());
		textFieldBetreffFIBU.setValue(mail.getSubject());
		textAreaBuchhaltung.setValue(mail.getMessage());

		mail = systemMB.getEmailKundeAbholung();
		textAreaAbholen.setValue(mail.getMessage());
		textFieldBetreffAbhol.setValue(mail.getSubject());

		mail = systemMB.getEmailKundeEingang();
		textFieldBetreffKauf.setValue(mail.getSubject());
		textAreaKunde.setValue(mail.getMessage());

		comboBoxAdminDelete.setItems(systemMB.getAdmins());
	}

	/**
	 * This model binds properties between AgpSettings and agp-settings
	 */
	public interface AgpSettingsModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}
}
