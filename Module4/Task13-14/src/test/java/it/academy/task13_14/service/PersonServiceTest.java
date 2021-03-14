package it.academy.task13_14.service;

import it.academy.task13_14.config.MainConfig;
import it.academy.task13_14.entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.PersistenceContext;

import static org.junit.Assert.*;

@ContextConfiguration(classes = MainConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonServiceTest {


    @Autowired
    PersonService personService;

    @Test
    public void testSaveAndGetPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Biden");
        person.setAge(72);
        String savedPersonId = personService.savePerson(person);
        assertEquals("John",personService.getById(savedPersonId).getFirstName());
    }
}