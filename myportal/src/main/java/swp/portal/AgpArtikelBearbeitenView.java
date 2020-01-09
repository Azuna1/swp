package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.entity.GeraetTO;
import swp.portal.beans.GeraetMB;
import swp.portal.beans.SystemMB;
import swp.portal.beans.UserMB;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import swp.portal.AgpMenu;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the agp-artikel-bearbeiten-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Route("ArtikelBearbeiten")
@Tag("agp-artikel-bearbeiten-view")
@JsModule("./src/agp-artikel-bearbeiten-view.js")
public class AgpArtikelBearbeitenView extends PolymerTemplate<AgpArtikelBearbeitenView.AgpArtikelBearbeitenViewModel>
		implements HasUrlParameter<Integer> {

	@Id("buttonSpeichern")
	private Button buttonSpeichern;
	@Id("buttonLoeschen")
	private Button buttonLoeschen;
	@Id("textFieldName")
	private TextField textFieldName;
	@Id("comboBoxKategorie")
	private ComboBox<String> comboBoxKategorie;
	@Id("comboBoxAnzahl")
	private ComboBox<Integer> comboBoxAnzahl;
	@Id("textFieldPreis")
	private TextField textFieldPreis;
	@Id("textAreaBeschreibung")
	private TextArea textAreaBeschreibung;
	private Collection<Integer> col = new ArrayList<Integer>();
	private int gTOId;
	private Upload upload;
	private byte[] imageBuffer;

	@Inject
	GeraetMB geraetMB;
	@Inject
	SystemMB systemMB;
	@Inject
	UserMB userMB;
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("uploadAnker")
	private Div uploadAnker;

	/**
	 * Creates a new AgpArtikelBearbeitenView.
	 */
	public AgpArtikelBearbeitenView() {
		// You can initialise any data required for the connected UI components here.

		for (int i = 0; i <= 100; i++)
			col.add(i);
		buttonSpeichern.addClickListener(e -> {
			if (gTOId != 0)
				try {
					geraetMB.editGeraet(gTOId, textAreaBeschreibung.getValue(), comboBoxKategorie.getValue(),
							NumberFormat.getInstance().parse(textFieldPreis.getValue()).doubleValue(),
							textFieldName.getValue(), comboBoxAnzahl.getValue(), this.imageBuffer);

				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			UI.getCurrent().navigate("");
		});
		buttonLoeschen.addClickListener(e -> {
			if (gTOId != 0)
				geraetMB.deleteGeraet(gTOId);
			UI.getCurrent().navigate("");
		});

		initUploaderImage();

	}

	/**
	 * This model binds properties between AgpArtikelBearbeitenView and
	 * agp-artikel-bearbeiten-view
	 */
	public interface AgpArtikelBearbeitenViewModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}

	private void initUploaderImage() {
		MemoryBuffer fileBuffer = new MemoryBuffer();
		upload = new Upload(fileBuffer);
		upload.setAcceptedFileTypes("image/jpeg", "image/jpg", "image/png", "image/gif");

		upload.addFinishedListener(event -> {
			try {
				// The image can be jpg png or gif, but we store it always as png file in this
				// example
				BufferedImage inputImage = ImageIO.read(fileBuffer.getInputStream());
				ByteArrayOutputStream pngContent = new ByteArrayOutputStream();
				ImageIO.write(inputImage, "png", pngContent);
				this.imageBuffer = pngContent.toByteArray();
			} catch (IOException e) {
				e.printStackTrace();
			}

		});
		uploadAnker.add(upload);
	}

	@Override
	public void setParameter(BeforeEvent event, Integer parameter) {
		if (!userMB.isLoggedIn() || !userMB.isAdmin()) {
			event.forwardTo("Login");
			return;
		}

		if (parameter == null)
			event.forwardTo("");

		GeraetTO gTO = geraetMB.getGeraet(parameter);
		if (gTO == null)
			event.forwardTo("");

		gTOId = parameter;
		this.textFieldName.setValue(gTO.getGeraetename());
		this.textFieldPreis.setValue(String.format("%.2f", gTO.getPreis()));
		this.textAreaBeschreibung.setValue(gTO.getBeschreibung());
		this.comboBoxAnzahl.setItems(col);
		this.comboBoxAnzahl.setValue(gTO.getAnzahl());
		this.comboBoxKategorie.setItems(systemMB.getKategories());
		this.comboBoxKategorie.setValue(gTO.getKategorie());
		this.imageBuffer = gTO.getImage();

	}
}
