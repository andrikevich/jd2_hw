package by.it.dao;

import by.it.pojos.Adress;
import by.it.pojos.BankClient;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;

public class Task8_Inheritance  extends  BaseTest{

    //Task 8.1  InheritanceType.SINGLE_TABLE

    @Test
    public void savePersonInheritBank() {
        Session session = factory.openSession();
        session.beginTransaction();
        BankClient bankClient  = new BankClient(49, "Sandra", "Bullok",
                new Adress("Gikalo","Minsk","220138")
                ,"PriorBank", 78L);


        Serializable actualId = session.save(bankClient);
        Assert.assertNotNull(actualId);



        session.getTransaction().commit();
        session.close();
    }
}
