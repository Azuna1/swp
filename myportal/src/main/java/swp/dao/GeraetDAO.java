
package swp.dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import swp.entity.GeraetTO;
import swp.entity.impl.Geraet;

@Stateless
public class GeraetDAO extends GenericDAO<Geraet> {

	public GeraetDAO(){		
		super(Geraet.class);
		
	}

	public void deleteGeraet(Geraet aGeraet) {
		super.delete(aGeraet.getGeraeteID());
		
	}

	public Geraet editGeraet(GeraetTO aGeraetTO) {
		Geraet aGeraet = super.find(aGeraetTO.getGeraeteID());
		aGeraet.setBeschreibung(aGeraetTO.getBeschreibung());
		aGeraet.setKategorie(aGeraetTO.getKategorie());
		aGeraet.setPreis(aGeraetTO.getPreis());
		aGeraet.setGeraetename(aGeraetTO.getGeraetename());
		aGeraet.setAnzahl(aGeraetTO.getAnzahl());
		return super.update(aGeraet);	
	
	}
	
	public List<Geraet> getFilteredGeraet(String name, String kategorie){
		
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<Geraet> cq = cb.createQuery(Geraet.class);
			Predicate namePredicate = null;
			Predicate kategoriePredicate = null;
			
			Root<Geraet> geraet = cq.from(Geraet.class);
			if ( !name.contentEquals(""))
				 namePredicate = cb.like(geraet.<String>get("geraetename"), "%" + name + "%");
			if ( !kategorie.contentEquals(""))
				 kategoriePredicate = cb.equal(geraet.get("kategorie"), kategorie);
			
			if (namePredicate != null && kategoriePredicate != null)
				cq.where(namePredicate, kategoriePredicate);
			else if (namePredicate != null )
				cq.where(namePredicate);
			else if (kategoriePredicate != null)
				cq.where( kategoriePredicate);
			
			
			TypedQuery<Geraet> query = entityManager.createQuery(cq);
			return query.getResultList();		
	}

}

