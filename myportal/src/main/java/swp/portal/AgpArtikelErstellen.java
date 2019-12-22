package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.portal.beans.GeraetMB;
import swp.portal.beans.SystemMB;
import swp.usecase.IGeraeteManager;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.imageio.ImageIO;
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
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
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
	
	private Upload upload;
	private byte[] imageBuffer;
	
	@Inject
	GeraetMB geraetMB;
	
	@Inject
	IGeraeteManager geraetManager;
	
	@Inject
	SystemMB systemMB;
    /**
     * Creates a new AgpArtikelErstellen.
     */
    public AgpArtikelErstellen() {
        // You can initialise any data required for the connected UI components here.
//    	buttonSpeichern.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//    	buttonLoeschen.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    	
    	Collection<Integer> col = new ArrayList<Integer>();
    	for (int i = 0; i <= 100; i++)
    		col.add(i);
    	
    	comboBoxAnzahl.setItems(col);
    	
    	buttonSpeichern.addClickListener(event -> {
//    		for (int i = 0; i < comboBoxAnzahl.getValue(); i++)
//    			geraetMB.createGeraet(textAreaArtikelbeschreibung.getValue(), comboBoxKategorie.getValue(), Double.valueOf(textFieldPreis.getValue()), textFieldArtikelname.getValue());
    		geraetMB.createGeraet(textAreaArtikelbeschreibung.getValue(), comboBoxKategorie.getValue(), Double.valueOf(textFieldPreis.getValue()), textFieldArtikelname.getValue(), comboBoxAnzahl.getValue(), this.imageBuffer);

    	});
    	
    	buttonLoeschen.addClickListener(event -> {
    		textAreaArtikelbeschreibung.setValue("");
    		comboBoxKategorie.setValue("");
    		textFieldPreis.setValue("");
    		textFieldArtikelname.setValue("");
    		comboBoxAnzahl.setValue(0);
    	});
    	
    	initUploaderImage();
    }

    @Override
	public void beforeEnter(BeforeEnterEvent event) {
		//TODO kategorien füllen
    	comboBoxKategorie.setItems(systemMB.getKategories());
		
	}
    
    private void initUploaderImage() {
        MemoryBuffer fileBuffer = new MemoryBuffer();
        upload = new Upload(fileBuffer);
        upload.setAcceptedFileTypes("image/jpeg","image/jpg", "image/png", "image/gif");

        upload.addFinishedListener(event -> {            
            try {
                // The image can be jpg png or gif, but we store it always as png file in this example
                BufferedImage inputImage = ImageIO.read(fileBuffer.getInputStream());
                ByteArrayOutputStream pngContent = new ByteArrayOutputStream();
                ImageIO.write(inputImage, "png", pngContent);         
                this.imageBuffer = pngContent.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

        vaadinVerticalLayout.add(upload);
    }
    
    /**
     * This model binds properties between AgpArtikelErstellen and agp-artikel-erstellen
     */
    public interface AgpArtikelErstellenModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
