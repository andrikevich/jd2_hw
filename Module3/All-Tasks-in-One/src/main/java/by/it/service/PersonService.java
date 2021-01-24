package by.it.service;
import by.it.pojos.Person;

import java.io.Serializable;

public interface PersonService {

    public Serializable savePerson (Person person);

    public void deletePerson(Person person);

    public Person loadPerson (int id);
}
