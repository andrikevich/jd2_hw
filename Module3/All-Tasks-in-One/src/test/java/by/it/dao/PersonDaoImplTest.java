package by.it.dao;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import by.it.pojos.Person;

public class PersonDaoImplTest extends BaseTest {

	PersonDaoImpl dao = new PersonDaoImpl("hibernate.cfg.test.xml");

	// testCases without DbUnit

	@Test
	public void savePerson() {

		Person savedPerson = new Person(null, 49, "Sandra", "Bullok");
		Serializable actualId = dao.savePerson(savedPerson);
		Assert.assertNotNull(actualId);
		dao.deletePerson(savedPerson);
	}

	@Test
	public void loadPerson() {
		Person savedPerson = new Person(null, 50, "Tom", "Cruze");
		Serializable actualId = dao.savePerson(savedPerson);
		Person loadedPerson = dao.loadPerson((Integer) actualId);
		Assert.assertEquals(savedPerson.getName() + savedPerson.getSurname(),
				loadedPerson.getName() + loadedPerson.getSurname());

	}

	@Test(expected = ObjectNotFoundException.class)
	public void deletePerson() {
		Person savedPerson = new Person(null, 50, "Angelina", "Jolly");
		Serializable actualId = dao.savePerson(savedPerson);
		dao.deletePerson(savedPerson);
		Assert.assertNull(dao.loadPerson((Integer) actualId));
	}

	// ------------------------------------------
	// testCases using DbUnit

	@Test
	public void loadPersonWithDbUnit() {
		// Given:
		cleanInsert("PersonTest.xml");
		// When
		Person loadedPerson = dao.loadPerson(999);
		// Then
		Assert.assertEquals("XavierSmith", loadedPerson.getName() + loadedPerson.getSurname());
		deleteDataset();
	}

	@Test(expected = PersistenceException.class)
	public void deletePersonWithDbUnit() {
		cleanInsert("PersonTest.xml");
		Person loadedPerson = dao.loadPerson(999);
		dao.deletePerson(loadedPerson);
		deleteDataset();
		Assert.assertNull(dao.loadPerson(999));
		
	}

	@org.junit.After
	public void tearDown() {

		dao.getSessionFactory().close();
	}
	

	
}