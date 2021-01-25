package by.it.dao;

import java.io.Serializable;

import javax.persistence.FlushModeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import by.it.exeption.NoSuchPersonExeption;
import by.it.pojos.Person;
import by.it.util.HibernateSessionFactoryReceiver;

public class PersonDaoImpl implements PersonDao{

    private String xmlCfgConfig;
    private SessionFactory sessionFactory;
    
    
    

    public String getXmlCfgConfig() {
		return xmlCfgConfig;
	}

	public PersonDaoImpl(String xmlCfgConfig) {
        this.xmlCfgConfig = xmlCfgConfig;
        this.sessionFactory = new HibernateSessionFactoryReceiver(xmlCfgConfig).getSessionFactory();
    }

    SessionFactory getSessionFactory () {
        return sessionFactory;
    }

    @Override
    public Serializable savePerson(Person person) {
        Session session = sessionFactory.openSession();
        if (session.isDirty()) session.flush();
        session.setFlushMode(FlushModeType.AUTO);
        session.beginTransaction();
       Serializable id = session.save(person);
        session.getTransaction().commit();
        return  id;

    }

    @Override
    public void deletePerson(Person person) {
        Session session = sessionFactory.openSession();
        
        if (session.isDirty()) session.flush();
        session.setFlushMode(FlushModeType.AUTO);
        
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();;

    }

    @Override
    public Person loadPerson(int id) {
        Session session = sessionFactory.openSession();
        if (session.isDirty()) session.flush();
        session.setFlushMode(FlushModeType.AUTO);
        session.beginTransaction();
        Person thePerson = session.load(Person.class,id);
        if (thePerson != null) {
            return thePerson;
            } else throw new NoSuchPersonExeption("There is no such person in a database with  id =" + id);
        }
}
