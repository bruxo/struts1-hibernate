package io.github.bruxo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


 
public class HibernateUtil {
 
    private static SessionFactory sessionFactory;
 
    public static void initialize() {
        try {
            Configuration config = new Configuration()
                    .configure(HibernateUtil.class
                            .getResource("/hibernate.cfg.xml"));
            sessionFactory = config.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error creating SessionFactory :" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
        sessionFactory.close();
    }
}
