package by.it.dao;

import by.it.pojos.Adress;
import by.it.pojos.Employee;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.util.List;

public class EmployeeTest  extends  BaseTest{

    @Test
    public void create(){
        //given
        Employee employee1 = new Employee("Technical","tech1", "tech1_pwd","12345678");
        Employee employee2 = new Employee("Financial","fin1", "fin1_pwd","87654321");

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
    public void getEmployee(){

        cleanInsert("EmployeeTest.xml");
        Session session = factory.openSession();
        session.beginTransaction();
        Employee person = session.get(Employee.class, "8a7e5fc2774e186201774e18670a0001");

        Assert.assertEquals("tech999",person.getLogin());

        session.close();
        factory.close();
        deleteDataset();
    }



}
