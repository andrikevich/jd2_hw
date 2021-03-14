package it.academy.task13_14.service;

import it.academy.task13_14.dao.PersonDao;
import it.academy.task13_14.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    @Transactional
    public Person getById(String id){
        return  personDao.getPersonById(id);
    }

    @Transactional
    public List<Person> getPersons(){
        return personDao.getPersons();
    }


    @Transactional
    public String savePerson(Person person){
        return personDao.saveOrUpdatePerson(person);
    }

    @Transactional
    public String deletePerson (Person person){
        return  personDao.deletePerson(person);
    }

}

