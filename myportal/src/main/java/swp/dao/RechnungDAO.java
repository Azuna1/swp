
package swp.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import swp.entity.impl.Rechnung;

@Stateless
public class RechnungDAO extends GenericDAO<Rechnung> {

	public RechnungDAO() {
		super(Rechnung.class);
	}

	public void deleteRechnung(Rechnung r) {
		super.delete(r.getRechnungsID());
	}

	public List<Rechnung> getUserRechnungen(String matrikelNR) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Rechnung> cq = cb.createQuery(Rechnung.class);

		Root<Rechnung> rechnung = cq.from(Rechnung.class);

		Predicate matrikelPredicate = cb.equal(rechnung.get("matrikelNr"), matrikelNR);
		cq.where(matrikelPredicate);

		TypedQuery<Rechnung> query = entityManager.createQuery(cq);
		return query.getResultList();
	}
}
