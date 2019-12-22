package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.entity.GeraetTO;
import swp.entity.RechnungTO;
import swp.portal.beans.SystemMB;
import swp.portal.beans.UserMB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the agp-bestellungen-verwalten-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-bestellungen-verwalten-view")
@JsModule("./src/agp-bestellungen-verwalten-view.js")
@Route("BestellungenVerwalten")
public class AgpBestellungenVerwaltenView extends PolymerTemplate<AgpBestellungenVerwaltenView.AgpBestellungenVerwaltenViewModel> implements BeforeEnterObserver {

    @Id("agpMenu")
    private AgpMenu agpMenu;
	@Id("textFieldSearch")
	private TextField textFieldSearch;
	@Id("vaadinGrid")
	private Grid<RechnungTO> vaadinGrid;
	
	@Inject
	SystemMB systemMB;
	@Inject
	UserMB userMB;
	@Id("buttonBezahlt")
	private Button buttonBezahlt;
	@Id("buttonDetails")
	private Button buttonDetails;
	
	public AgpBestellungenVerwaltenView() {
        // You can initialise any data required for the connected UI components here.

		buttonDetails.addClickListener(e -> {
			vaadinGrid.getSelectionModel().getFirstSelectedItem().ifPresent(item -> UI.getCurrent().navigate("RechnungView/" + item.getRechnungsID()) );
			
		});
		buttonBezahlt.addClickListener(e -> {
			vaadinGrid.getSelectionModel().getFirstSelectedItem().ifPresent(item -> {
				systemMB.setRechnungBezahlt(item.getRechnungsID());
				fillGrid("");
			});
		});
		
		textFieldSearch.addValueChangeListener(e -> {
			fillGrid(textFieldSearch.getValue());
		});
	}

	
	@PostConstruct
	private void prepare()
	{
		vaadinGrid.addColumn(RechnungTO::getRechnungsID).setHeader("Rechnungsnummer");
		vaadinGrid.addColumn(RechnungTO::getRechnungsdatum).setHeader("Datum");
		vaadinGrid.addColumn(RechnungTO::getName).setHeader("Vorname");
		vaadinGrid.addColumn(RechnungTO::getSurname).setHeader("Nachname");
		vaadinGrid.addColumn(RechnungTO::getIstBezahlt).setHeader("Bezahlt");
		vaadinGrid.addColumn(new NumberRenderer<>(RechnungTO::getEndbetrag, "€ %(,.2f",Locale.GERMAN, "€ 0.00")).setHeader("Preis").setTextAlign(ColumnTextAlign.END);		
	}
	
	private void fillGrid(String filter ) {
		ArrayList<RechnungTO> list = new ArrayList<>();
		if(userMB.isAdmin())
			 list = (ArrayList<RechnungTO>) systemMB.getRechnungen();
		else			
			 list = (ArrayList<RechnungTO>) systemMB.getRechnungenForUser(userMB.getMatrikelNr());
		
		Iterator<RechnungTO> itr = list.iterator();
		while (itr.hasNext()) {
			RechnungTO rTO = itr.next();
			if(!String.valueOf(rTO.getRechnungsID()).contains(filter) &&
					!rTO.getRechnungsdatum().toGMTString().contains(filter) &&
					!rTO.getName().contains(filter) &&
					!rTO.getSurname().contains(filter) &&
					!String.valueOf(rTO.getIstBezahlt()).contains(filter));
				itr.remove();
		}
		vaadinGrid.setItems(list);	

		

	}
	
	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		if(!userMB.isAdmin())
			buttonBezahlt.setVisible(false);
		fillGrid("");
		
	}
	
	
    /**
     * This model binds properties between AgpBestellungenVerwaltenView and agp-bestellungen-verwalten-view
     */
    public interface AgpBestellungenVerwaltenViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
