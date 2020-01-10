package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.entity.GeraetTO;
import swp.entity.RechnungTO;
import swp.portal.beans.GeraetMB;
import swp.portal.beans.UserMB;

import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the agp-shop-artikel-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("agp-shop-artikel-view")
@JsModule("./src/agp-shop-artikel-view.js")
@Route("ShopArtikel")
@Push
public class AgpShopArtikelView extends PolymerTemplate<AgpShopArtikelView.AgpShopArtikelViewModel>
		implements HasUrlParameter<Integer> {

	private int artikelID;
	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("textName")
	private Label textName;
	@Id("textPreis")
	private Label textPreis;
	@Id("textKategorie")
	private Label textKategorie;
	@Id("textBeschreibung")
	private Label textBeschreibung;
	@Id("buttonWarenkorb")
	private Button buttonWarenkorb;
	@Id("imageContainer")
	private Div imageContainer;
	@Inject
	UserMB userMB;
	@Inject
	GeraetMB geraetMB;

	
	public AgpShopArtikelView() {
		// You can initialise any data required for the connected UI components here.

		buttonWarenkorb.addClickListener(e -> {
			userMB.addToWarenkorb(this.getArtikelID());
			UI.getCurrent().access(() -> {
				agpMenu.warenkorb.setText(String.format("Warenkorb(%d)", userMB.countWarenkorb()));
			});

			Notification.show("Artikel zum Warenkorb hinzugefügt!");
		});
	}

	@Override
	public void setParameter(BeforeEvent event, Integer parameter) {
		if (!userMB.isLoggedIn()) {
			event.forwardTo("Login");
			return;
		}

		if (parameter == null)
			event.forwardTo("");

		GeraetTO gTO = geraetMB.getGeraet(parameter);
		if (gTO == null)
			event.forwardTo("");

		this.setArtikelID(parameter);
		textName.setText(gTO.getGeraetename());
		textPreis.setText(String.format("%.2f€", gTO.getPreis()));
		textKategorie.setText(gTO.getKategorie());
		textBeschreibung.setText(gTO.getBeschreibung());
		createImage(geraetMB.getImage(gTO));

	}
	
	public void createImage(Image image) {
		image.setWidth("350px");
		image.setHeight("350px");
		image.getStyle().set("padding-top", "5px");
		imageContainer.removeAll();
		imageContainer.add(image);
	}

	public int getArtikelID() {
		return artikelID;
	}

	public void setArtikelID(int artikelID) {
		this.artikelID = artikelID;
	}

	/**
	 * This model binds properties between AgpShopArtikelView and
	 * agp-shop-artikel-view
	 */
	public interface AgpShopArtikelViewModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}
}
