package by.it.dao;

import org.hibernate.ObjectNotFoundException;
import org.junit.Assert;
import org.junit.Test;
import by.it.pojos.*;

import java.io.Serializable;

public class PersonDaoImplTest {

    PersonDaoImpl dao = new PersonDaoImpl("hibernate.cfg.test.xml");

    @Test
    public void savePerson() {

        Person savedPerson = new Person (null,49,"Sandra","Bullok");
        Serializable actualId = dao.savePerson(savedPerson);
        Assert.assertNotNull(actualId);
    }

    @Test
    public void loadPerson () {
        Person savedPerson = new Person (null,50,"Tom","Cruze");
        Serializable actualId = dao.savePerson(savedPerson);
        Person loadedPerson = dao.loadPerson((Integer) actualId);
        Assert.assertEquals(savedPerson.getName()+savedPerson.getSurname(),loadedPerson.getName()+loadedPerson.getSurname());

    }

    @Test (expected = ObjectNotFoundException.class)
    public  void deletePerson(){
        Person savedPerson = new Person (null,50,"Angelina","Jolly");
        Serializable actualId = dao.savePerson(savedPerson);
        dao.deletePerson(savedPerson);
        Assert.assertNull(dao.loadPerson((Integer) actualId));
    }
}