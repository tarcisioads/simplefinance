package util;

import javax.persistence.*;

public class HibernateUtil {
	
	@PersistenceUnit(unitName="default")
    private EntityManagerFactory factory;
	
/*	private static final SessionFactory sessionFactory;

	static {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.configure().buildServiceRegistry();
			MetadataSources metadataSources = new MetadataSources(
					serviceRegistry);
			metadataSources.addAnnotatedClass(Lanc.class);
			Metadata metadata = metadataSources.buildMetadata();
			sessionFactory = metadata.buildSessionFactory();
			
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
*/
	public EntityManagerFactory getFactory() {
		return factory;
	}
}
