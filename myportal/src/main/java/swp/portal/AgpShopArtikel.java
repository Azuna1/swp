package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;

/**
 * A Designer generated component for the agp-shop-artikel template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-shop-artikel")
@JsModule("./src/agp-shop-artikel.js")
public class AgpShopArtikel extends PolymerTemplate<AgpShopArtikel.AgpShopArtikelModel> {
	
	
	
	
	
	@Id("buttonWarenkorb")
	private Button buttonWarenkorb;	

	private int artikelID;

	@Id("textBeschreibung")
	private Label textBeschreibung;

	@Id("textPreis")
	private Label textPreis;

	@Id("textName")
	private Label textName;

	@Id("vaadinButton")
	private Button vaadinButton;

	public AgpShopArtikel() {
        // You can initialise any data required for the connected UI components here.
		textName.setText("name");
		textPreis.setText("22€");
		textBeschreibung.setText("beschreibung");    
	}
	
	public String getName() {
		return textName.getText();
	}
	public void setName(String name) {
		this.textName.setText(name);
	}
	public double getPreis() {
		return Double.parseDouble(this.textPreis.getText());
	}
	public void setPreis(double preis) {
		this.textPreis.setText(Double.toString(preis));
	}
	public String getBeschreibung() {
		return textBeschreibung.getText();
	}
	public void setBeschreibung(String text) {
		this.textBeschreibung.setText(text);
	}
	public int getArtikelID() {
		return this.artikelID;
	}
	public void setArtikelID(int id) {
		this.artikelID = id;
	}

    /**
     * This model binds properties between AgpShopArtikel and agp-shop-artikel
     */
    public interface AgpShopArtikelModel extends TemplateModel {
        // Add setters and getters for template properties here.
    	
    }
}
