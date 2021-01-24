package by.it.service;

import by.it.dao.PersonDao;
import by.it.pojos.Person;

import java.io.Serializable;


public class PersonServiceImpl  implements  PersonService{

    PersonDao personDao;
    @Override
    public Serializable savePerson(Person person) {
       return  personDao.savePerson(person);
    }

    @Override
    public void deletePerson(Person person) {
        personDao.deletePerson(person);

    }

    @Override
    public Person loadPerson(int id) {
        return personDao.loadPerson(id);
    }
}
