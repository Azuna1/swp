package swp.portal.beans;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.inject.Inject;

import com.vaadin.cdi.annotation.VaadinSessionScoped;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.server.StreamResource;

import swp.entity.GeraetTO;
import swp.usecase.IGeraeteManager;

@VaadinSessionScoped
public class GeraetMB {

	@Inject
	IGeraeteManager geraeteManager;

//	public void saveImage(int id ,byte[] byteArray) {
//		GeraetTO gTO = geraeteManager.getGeraet(id);
//		gTO.setImage(byteArray);
//		geraeteManager.editGeraet(gTO);
//		
//	}

	public Image getImage(GeraetTO gTO) {
		byte[] buffer = gTO.getImage();

		if (buffer == null)
			return new Image();

		StreamResource sr = new StreamResource("artikelImage", () -> {
			return new ByteArrayInputStream(buffer);
		});
		sr.setContentType("image/png");
		Image image = new Image(sr, "artikle-image");
		return image;
	}

	public void createGeraet(String beschreibung, String kategorie, double preis, String geraetename, int anzahl,
			byte[] imageBuffer) {
		geraeteManager.createGeraet(beschreibung, kategorie, preis, geraetename, anzahl, imageBuffer);
	}

	public List<GeraetTO> getAllGeraete() {
		return geraeteManager.getAllGeraete();
	}

	public void deleteGeraet(int id) {
		geraeteManager.deleteGeraet(id);
	}

	public GeraetTO getGeraet(int id) {
		return geraeteManager.getGeraet(id);
	}

	public void editGeraet(int id, String beschreibung, String kategorie, double preis, String geraetename, int anzahl,
			byte[] imageBuffer) {
		GeraetTO gTO = new GeraetTO();
		gTO.setGeraeteID(id);
		gTO.setBeschreibung(beschreibung);
		gTO.setKategorie(kategorie);
		gTO.setPreis(preis);
		gTO.setGeraetename(geraetename);
		gTO.setAnzahl(anzahl);
		gTO.setImage(imageBuffer);
		geraeteManager.editGeraet(gTO);
	}

	public List<GeraetTO> getFilteredGeraete(String name, String kategorie) {
		return geraeteManager.getFilteredGeraete(name, kategorie);
	}

}
