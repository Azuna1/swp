package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

import swp.entity.RechnungTO;
import swp.portal.AgpMenu;
import swp.portal.beans.SystemMB;
import swp.portal.beans.UserMB;

import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;

/**
 * A Designer generated component for the agp-rechnung-view template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Route("RechnungView")
@Tag("agp-rechnung-view")
@JsModule("./src/agp-rechnung-view.js")
public class AgpRechnungView extends PolymerTemplate<AgpRechnungView.AgpRechnungViewModel>
		implements HasUrlParameter<Integer> {

	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("textBruto")
	private Label textBruto;
	@Id("textSteuern")
	private Label textSteuern;
	@Id("textSumme")
	private Label textSumme;
	@Id("vaadinGrid")
	private Grid<String> vaadinGrid;
	@Id("textKunde")
	private Label textKunde;
	@Id("textDatum")
	private Label textDatum;
	@Id("textRechnungsNr")
	private Label textRechnungsNr;

	@Inject
	UserMB userMB;
	@Inject
	SystemMB systemMB;

	/**
	 * Creates a new AgpRechnungView.
	 */
	public AgpRechnungView() {
		// You can initialise any data required for the connected UI components here.
	}

	/**
	 * This model binds properties between AgpRechnungView and agp-rechnung-view
	 */
	public interface AgpRechnungViewModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}

	@PostConstruct
	private void prepare() {
		vaadinGrid.addColumn(item -> item.toString()).setHeader("Artikel");

	}

	@Override
	public void setParameter(BeforeEvent event, Integer parameter) {
		if (!userMB.isLoggedIn()) {
			event.forwardTo("Login");
			return;
		}

		if (parameter == null)
			event.forwardTo("");

		RechnungTO rTO = systemMB.getRechnung(parameter);
		if (rTO == null)
			event.forwardTo("");
		vaadinGrid.setItems(rTO.getArtikel());
		textBruto.setText(String.format("%.2f€", rTO.getEndbetrag() / 1.19));
		textSteuern.setText(String.format("%.2f€", rTO.getEndbetrag() / 1.19 * 0.19));
		textSumme.setText(String.format("%.2f€", rTO.getEndbetrag()));
		textKunde.setText(rTO.getName() + " " + rTO.getSurname());
		textDatum.setText(rTO.getRechnungsdatum().toGMTString());
		textRechnungsNr.setText(String.format("%d", rTO.getRechnungsID()));

	}
}
