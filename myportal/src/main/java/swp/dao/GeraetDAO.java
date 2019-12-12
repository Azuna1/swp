package swp.dao;


import swp.entity.GeraetTO;
import swp.entity.impl.Geraet;

//@Stateless
public class GeraetDAO extends GenericDAO<Geraet> {

	public GeraetDAO(){
		super(Geraet.class);
	}

	public void deleteGeraet(Geraet aGeraet) {
		super.delete(aGeraet.getGeraeteID(), Geraet.class);
		
	}

	public Geraet editGeraet(GeraetTO aGeraetTO) {
		Geraet aGeraet = super.find(aGeraetTO.getGeraeteID());
		aGeraet.setBeschreibung(aGeraetTO.getBeschreibung());
		aGeraet.setKategorie(aGeraetTO.getKategorie());
		aGeraet.setPreis(aGeraetTO.getPreis());
		aGeraet.setGeraetename(aGeraetTO.getGeraetename());
		return super.update(aGeraet);	
	
	}

}
