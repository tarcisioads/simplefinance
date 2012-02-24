package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import bean.Lanc;

public class DAOLanc {

	@PersistenceContext(unitName = "simpleModernEEApplication")
	protected EntityManager em;
	
	public boolean save(Lanc lanc) {

		//EntityTransaction transaction = em.getTransaction();

		try {
			//transaction.begin();
			em.persist(lanc);
			//transaction.commit();
		} catch (Exception e) {
			//transaction.rollback();
			return false;
		}
		return true;
		/*
		 * Session session =
		 * HibernateUtil.getSessionFactory().getCurrentSession(); new
		 * HibernateUtil().getFactory().createEntityManager(). Transaction tx =
		 * session.beginTransaction(); try{ session.save(lanc); }catch(Exception
		 * e){ tx.rollback(); session.close(); return false; } tx.commit();
		 * session.close(); return true;
		 */}
	
	public List<Lanc> getAllLanc(){
		return em.createQuery("select t from "+Lanc.class.getSimpleName()+" t").getResultList();
	}

}
