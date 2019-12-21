package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

import swp.entity.GeraetTO;
import swp.portal.AgpMenu;
import swp.portal.beans.GeraetMB;
import swp.portal.beans.SystemMB;
import swp.portal.beans.UserMB;

/**
 * A Designer generated component for the agp-shop-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("agp-shop-view")
@JsModule("./src/agp-shop-view.js")
@Route("")
public class AgpShopView extends PolymerTemplate<AgpShopView.AgpShopViewModel> implements BeforeEnterObserver {

	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("textFieldSuchen")
	private TextField textFieldSuchen;
	@Id("comboBoxFilter")
	private ComboBox<String> comboBoxFilter;
	@Id("layoutArtikel")
	private VerticalLayout layoutArtikel;
	private ArrayList<AgpShopArtikel> artikelList = new ArrayList<>();
	private ArrayList<HorizontalLayout> layoutList = new ArrayList<>();

	@Inject
	GeraetMB geraetMB;
	@Inject
	SystemMB systemMB;
	@Inject
	UserMB userMB;

	/**
	 * Creates a new AgpShopView.
	 */
	public AgpShopView() {
		// You can initialise any data required for the connected UI components here.
		comboBoxFilter.addValueChangeListener(e -> {
			// Notification.show("filter changed: " + comboBoxFilter.getValue());
			showFiltered(textFieldSuchen.getValue(), comboBoxFilter.getValue());

		});
		textFieldSuchen.addValueChangeListener(e -> {
			showFiltered(textFieldSuchen.getValue(), comboBoxFilter.getValue());
		});

	}

	private void deleteAll() {

		for (HorizontalLayout layout : layoutList) {
			layout.removeAll();
		}

		layoutList.clear();
		artikelList.clear();

	}

	// TODO filter by DB
	private void showFiltered(String name, String compare) {
		if (compare == null || name == null)
			return;

		int i = 0;
		HorizontalLayout x = null;
		AgpShopArtikel artikel;
		deleteAll();

		x = new HorizontalLayout();
		layoutList.add(x);
		x.getStyle().set("justify-content", "center");
		x.getStyle().set("width", "100%");
		x.getStyle().set("theme", "spacing");
		layoutArtikel.add(x);

		for (GeraetTO gTO : geraetMB.getFilteredGeraete(name, compare)) {
			if (i == 3) {
				x = new HorizontalLayout();
				layoutList.add(x);
				x.getStyle().set("justify-content", "center");
				x.getStyle().set("width", "100%");
				x.getStyle().set("theme", "spacing");
				layoutArtikel.add(x);
				i = 0;
			}

			artikel = new AgpShopArtikel();
			artikelList.add(artikel);
			artikel.setArtikelID(gTO.getGeraeteID());
			artikel.setBeschreibung(gTO.getBeschreibung());
			artikel.setName(gTO.getGeraetename());
			artikel.setPreis(gTO.getPreis());
			artikel.setKategorie(gTO.getKategorie());
			artikel.setUserMB(userMB);

			x.add(artikel);
			i++;

		}
	}

	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		if (!userMB.isLoggedIn())
			return;
		comboBoxFilter.setItems(systemMB.getKategories());
		deleteAll();
		showFiltered("", "");

		if (userMB.isAdmin()) {
			artikelList.forEach(a -> a.setAdmin());
		}

	}

	/**
	 * This model binds properties between AgpShopView and agp-shop-view
	 */
	public interface AgpShopViewModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}
}
