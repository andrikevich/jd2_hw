package by.it.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactoryReceiver {

    private String xmlConfigFileName;

    public HibernateSessionFactoryReceiver(String xmlConfigFileName) {

        this.xmlConfigFileName = xmlConfigFileName;
    }

    public SessionFactory getSessionFactory (){
        final StandardServiceRegistry standardServiceRegistry
                                            = new StandardServiceRegistryBuilder()
                                            .configure(xmlConfigFileName)
                                            .build();

        SessionFactory sessionFactory = new MetadataSources(standardServiceRegistry)
                .buildMetadata().buildSessionFactory();
        return  sessionFactory;
    }
}
