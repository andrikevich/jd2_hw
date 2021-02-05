package by.it.dao;

import by.it.pojos.Adress;
import by.it.pojos.BankClient;
import by.it.pojos.Person;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;

public class Task8_Inheritance  extends  BaseTest{

    //Task 8.3  InheritanceType.TABLE_PER_CLASS

    @Test
    public void savePersonInheritBank() {
        Session session = factory.openSession();
        session.beginTransaction();
        BankClient bankClient  = new BankClient(49, "Angelina", "Jolly",
                new Adress("Gikalo","Minsk","220138")
                ,"BelAgroPromBank", 1L);
        Person savedPerson = new Person( 50, "Tom", "Cruze");

        session.save(savedPerson);


        Serializable actualIdBank = session.save(bankClient);
        Serializable actualIdPerson = session.save(savedPerson);
        Assert.assertNotNull(actualIdBank);



        session.getTransaction().commit();
        session.close();
    }
}
