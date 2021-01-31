package by.it.loader;

import by.it.pojos.Adress;
import by.it.pojos.Person;
import by.it.util.HibernateUtil;

import javax.persistence.EntityManager;

public class PersonLoader {

    public static void main(String[] args) {
        Person person =new Person(36,"Yuli","Slabko");
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
        HibernateUtil.close();




    }

}
