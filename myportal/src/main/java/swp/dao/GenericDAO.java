package swp.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.mapping.PrimaryKey;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

public abstract class GenericDAO<T> {

	//protected final static Logger logger = getLogger(GenericDAO.class);
	
	@PersistenceContext(unitName="swpDB")
	private EntityManager entityManager;
	
	private Class<T> entityClass;
	
	public GenericDAO(){}
	
	public GenericDAO(Class<T> entityClass){
		this.entityClass = entityClass;
	}	
	
	public void save(T entity) {
		System.out.println("em = " + entityManager == null);;
		entityManager.persist(entity);		
	}
	
	public T update(T entity) {
		 return entityManager.merge(entity);
	}
	
	protected boolean delete(Object id, Class<T> classe){
		T entityToBeRemoved = entityManager.getReference(classe, id);
		try {
			entityManager.remove(entityToBeRemoved);
			return true;
		} catch (Exception e){
			System.out.println("Fehler beim Löschen der Id: " + id.toString());
			return false;
		}
	}
	
	public T find(int entityId) {
		return entityManager.find(entityClass, entityId);
	}
	
	@SuppressWarnings({"unchecked","rawtypes"})
	public List<T> findAll(){
		CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return entityManager.createQuery(cq).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	protected T findOneResult (String namedQuery, Map<String, Object> parameters){
		T result = null;
		try {
			Query query = entityManager.createNamedQuery(namedQuery);
			if (parameters != null && !parameters.isEmpty()){
				populateQueryParameters(query, parameters);
			}
			
			result = (T) query.getSingleResult();
					
		} catch (Exception e){
			System.out.println("Fehler bei der Query: "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> findListResult(String namedQuery, Map<String, Object> parameters){
		List<T> result = null;
		try{
			Query query = entityManager.createNamedQuery(namedQuery);
			if (parameters != null && !parameters.isEmpty()){
				populateQueryParameters(query,parameters);
			}
			result = (List<T>) query.getResultList();
		} catch (Exception e){
			System.out.println("Fehler bei der Query: "+e.getMessage());
		}
		return result;
	}
	
	private void populateQueryParameters(Query query, Map<String, Object> parameters){
		for (Entry<String, Object> entry : parameters.entrySet()){
			query.setParameter(entry.getKey(),  entry.getValue());
		}
	}
	

	
}
