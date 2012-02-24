package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	private static EntityManagerFactory emf;

	public static EntityManager getEntityManager() {
		if (emf == null){
			emf = Persistence.createEntityManagerFactory("SimpleFinance");
		}
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public static void close(){
		emf.close();
	}

}
