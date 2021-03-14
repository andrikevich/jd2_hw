package it.academy.task13_14.dao;

import it.academy.task13_14.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao{

    @PersistenceContext(name = "entityManagerFactory")
    EntityManager entityManager;


    @Override
    public Person getPersonById(String id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public List<Person> getPersons() {
        Query query = entityManager.createQuery("SELECT p FROM Person AS p", Person.class);
        return query.getResultList();
    }

    @Override
    public String saveOrUpdatePerson(Person person) {
        return entityManager.merge(person).getId();
    }

    @Override
    public String deletePerson(Person person) {
        String id = person.getId();
        entityManager.remove(person);
        return id;
    }


}
