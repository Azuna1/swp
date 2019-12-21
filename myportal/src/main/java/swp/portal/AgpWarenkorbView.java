package swp.portal;

import com.vaadin.flow.templatemodel.TemplateModel;

import swp.entity.GeraetTO;
import swp.portal.beans.GeraetMB;
import swp.portal.beans.SystemMB;
import swp.portal.beans.UserMB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;

/**
 * A Designer generated component for the agp-warenkorb-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("agp-warenkorb-view")
@JsModule("./src/agp-warenkorb-view.js")
@Route("Warenkorb")
public class AgpWarenkorbView extends PolymerTemplate<AgpWarenkorbView.AgpWarenkorbViewModel> implements BeforeEnterObserver {

	@Id("agpMenu")
	private AgpMenu agpMenu;
	@Id("vaadinGrid")
	private Grid<GeraetTO> vaadinGrid;
	@Id("buttonKaufen")
	private Button buttonKaufen;
	@Id("textSumme")
	private Label textSumme;
	
	@Inject
	UserMB userMB;
	@Inject
	SystemMB systemMB;
	@Inject
	GeraetMB geraetMB;
	
	@Id("buttonRemoveArtikel")
	private Button buttonRemoveArtikel;
	
	public AgpWarenkorbView() {

		buttonRemoveArtikel.addClickListener(e -> {
			vaadinGrid.getSelectionModel().getFirstSelectedItem().ifPresent(item -> userMB.removeFromWarenkorb(item.getGeraeteID()) );
			fillGrid();
		});
		
		buttonKaufen.addClickListener( e -> {
			HashMap<Integer,Integer> warenkorb = new HashMap<Integer,Integer>();
			for (GeraetTO gTO : userMB.getWarenkorb()) {
				warenkorb.put(gTO.getGeraeteID(), warenkorb.get(gTO.getGeraeteID()) == null ? 1 : warenkorb.get(gTO.getGeraeteID()) + 1 );
			}

			for (Map.Entry<Integer, Integer> entry : warenkorb.entrySet()) {
				if(geraetMB.getGeraet(entry.getKey()).getAnzahl() < entry.getValue()) {
					Notification.show("Artikel nicht ausreichend verfügbar: " + geraetMB.getGeraet(entry.getKey()).getGeraetename());
					return;
				}
			}
			
			systemMB.createRechnung(userMB.getMatrikelNr(), userMB.getName(), userMB.getSurname(), userMB.getWarenkorb(), warenkorb);		
			userMB.emptyWarenkorb();
			fillGrid();
			UI.getCurrent().navigate("BestellungenVerwalten");

		});
		
    }

	@PostConstruct
	private void prepare()
	{
		vaadinGrid.addColumn(GeraetTO::getGeraetename).setHeader("Name");
		vaadinGrid.addColumn(new NumberRenderer<>(GeraetTO::getPreis, "€ %(,.2f",Locale.GERMAN, "€ 0.00")).setHeader("Preis").setTextAlign(ColumnTextAlign.END);		
	}
	
	private void fillGrid() {
		ArrayList<GeraetTO> list = (ArrayList<GeraetTO>) userMB.getWarenkorb();
		double summe = 0;
		vaadinGrid.setItems(list);	
		for(GeraetTO gTO : list)
			summe += gTO.getPreis();
		
		textSumme.setText(String.format("%.2f", summe) + "€");
	}
	
	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		fillGrid();
		
	}
	
    /**
     * This model binds properties between AgpWarenkorbView and agp-warenkorb-view
     */
    public interface AgpWarenkorbViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
