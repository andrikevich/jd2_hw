package by.it.dao;

import by.it.pojos.Adress;
import by.it.pojos.Employee;
import by.it.pojos.Person;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;

public class TestEbeddeance extends BaseTest {

    @Test
    public void createEmployeeWithAdress(){
        //given
        Employee employee1 = new Employee(
                "Technical","tech1", "tech1_pwd","12345678",new Adress("Gikalo","Minsk","220138"));
        Employee employee2 = new Employee(
                "Financial","fin1", "fin1_pwd","87654321",new Adress("Platonova","Minsk","220000"));

        //when
        Session session = factory.openSession();
        session.beginTransaction();


        Serializable save1 = session.save(employee1);
        Serializable save2 =  session.save(employee2);

        session.getTransaction().commit();

        //then
        Assert.assertNotNull(save1);
        Assert.assertNotNull(save2);

    }

    @Test
    public void createPersonWithAdress(){
        //given
        Person person1 = new Person(33,"Sandra","Bullok",new Adress("Gikalo","Minsk","220138"));
        Person person2 = new Person(48,"Bill","Gates",new Adress("Platonova","Minsk","220000"));

        //when
        Session session = factory.openSession();
        session.beginTransaction();


        Serializable save1 = session.save(person1);
        Serializable save2 =  session.save(person2);

        session.getTransaction().commit();

        //then
        Assert.assertNotNull(save1);
        Assert.assertNotNull(save2);

    }

}
