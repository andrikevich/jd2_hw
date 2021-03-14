package it.academy.task13_14.dao;

import it.academy.task13_14.entity.Person;

import java.util.List;

public interface PersonDao {

    Person getPersonById(String id);

    List<Person> getPersons();

    String saveOrUpdatePerson(Person person);

    String deletePerson(Person person);
}
