package swp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

public abstract class GenericDAO<T> {

	// protected final static Logger logger = getLogger(GenericDAO.class);

	@PersistenceContext(unitName = "swpDB")
	protected EntityManager entityManager;

	private Class<T> entityClass;

	public GenericDAO() {
	}

	public GenericDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public void save(T entity) {
		System.out.println("em = " + entityManager == null);
		;
		entityManager.persist(entity);
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public boolean delete(Object id) {
		T entityToBeRemoved = entityManager.getReference(entityClass, id);
		try {
			entityManager.remove(entityToBeRemoved);
			return true;
		} catch (Exception e) {
			System.out.println("Fehler beim Löschen der Id: " + id.toString());
			return false;
		}
	}

	public T find(Object entityId) {
		return entityManager.find(entityClass, entityId);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> findAll() {
		CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return entityManager.createQuery(cq).getResultList();
	}

//	public List<T> findFiltered(Map<String,Object> params){
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<T> q = cb.createQuery(entityClass);
//		Root<T> c = q.from(entityClass);
//		q.select(q.from(entityClass));
//		
//		List<ParameterExpression<T>> list = new ArrayList<>();
//		
//		for (Map.Entry<String, Object> entry : params.entrySet()) {
//			list.add(cb.parameter(entry.getValue().getClass(), entry.getKey()));
//		}
//		ParameterExpression<paramClass> p = cb.parameter(paramClass);
//		q.where(cg.get(c.get(map), p ));
//		return
//		
//	}

//	deprecated
//	@SuppressWarnings("unchecked")
//	protected T findOneResult (String namedQuery, Map<String, Object> parameters){
//		T result = null;
//		try {
//			Query query = entityManager.createNamedQuery(namedQuery);
//			if (parameters != null && !parameters.isEmpty()){
//				populateQueryParameters(query, parameters);
//			}
//			
//			result = (T) query.getSingleResult();
//					
//		} catch (Exception e){
//			System.out.println("Fehler bei der Query: "+e.getMessage());
//			e.printStackTrace();
//		}
//		
//		return result;
//	}
//	
//	@SuppressWarnings("unchecked")
//	protected List<T> findListResult(String namedQuery, Map<String, Object> parameters){
//		List<T> result = null;
//		try{
//			Query query = entityManager.createNamedQuery(namedQuery);
//			if (parameters != null && !parameters.isEmpty()){
//				populateQueryParameters(query,parameters);
//			}
//			result = (List<T>) query.getResultList();
//		} catch (Exception e){
//			System.out.println("Fehler bei der Query: "+e.getMessage());
//		}
//		return result;
//	}
//	
//	private void populateQueryParameters(Query query, Map<String, Object> parameters){
//		for (Entry<String, Object> entry : parameters.entrySet()){
//			query.setParameter(entry.getKey(),  entry.getValue());
//		}
//	}

}
