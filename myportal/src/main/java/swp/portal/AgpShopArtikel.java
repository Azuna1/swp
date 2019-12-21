package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.portal.beans.GeraetMB;
import swp.portal.beans.UserMB;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

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
//	private String kategorie;

	@Id("textBeschreibung")
	private Label textBeschreibung;

	@Id("textPreis")
	private Label textPreis;

	@Id("textName")
	private Label textName;

	@Id("buttonDetail")
	private Button buttonDetail;
	
	private UserMB userMB;

	@Id("textKategorie")
	private Label textKategorie;

	public AgpShopArtikel() {
        // You can initialise any data required for the connected UI components here.
		buttonWarenkorb.addClickListener(e -> {
			if (userMB.isAdmin()) {				
				UI.getCurrent().navigate("ArtikelBearbeiten/" + this.getArtikelID());
			}
			else
				userMB.addToWarenkorb(this.getArtikelID());
		});
		buttonDetail.addClickListener(e -> {
			Notification.show(String.format("%d",this.getArtikelID()));
		});
		  
	}
	
	
	
	
	public void setUserMB(UserMB userMB) {
		this.userMB = userMB;
	}
	
	public void setAdmin() {
		buttonWarenkorb.setText("Artikel Bearbeiten");
		buttonDetail.setVisible(false);			
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
		this.textPreis.setText(String.format("%.2f€",preis));
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


	public String getKategorie() {
		return textKategorie.getText();
	}

	public void setKategorie(String kategorie) {
		this.textKategorie.setText(kategorie);
	}

	/**
     * This model binds properties between AgpShopArtikel and agp-shop-artikel
     */
    public interface AgpShopArtikelModel extends TemplateModel {
        // Add setters and getters for template properties here.
    	
    }
}
