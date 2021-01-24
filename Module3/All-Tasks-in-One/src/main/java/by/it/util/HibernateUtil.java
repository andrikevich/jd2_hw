package by.it.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class HibernateUtil {



    private static final EntityManagerFactory emFactory;

    static{
        //  JPA implementation
        emFactory = Persistence.createEntityManagerFactory("by.it");
    }

    //  JPA implementation
    public static EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    public static void close() {
        emFactory.close();
    }



    //------------------


}
