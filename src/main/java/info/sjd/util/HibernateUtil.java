package info.sjd.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = createSessionFactory();

    private static SessionFactory createSessionFactory() {
//        Configuration configuration = new Configuration().configure();
        Configuration configuration = new Configuration();
        
//        configuration.addAnnotatedClass(EntityClass.class);
       
		return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
