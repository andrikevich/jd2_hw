package by.it.dao;

import by.it.pojos.Employee;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import by.it.pojos.Person;

import java.io.Serializable;

public class DifferentIdTesting extends  BaseTest{

   // for  Task-6
    @Test
    public void printPersonEmployeeIds (){
        Session session = factory.openSession();
        session.beginTransaction();
        Person savedPerson = new Person(13,"Donald","Trump");
        Employee savedEmployee = new Employee("Marketing","mark_1","mark_pwd_1","8787876");
        Serializable thePersonId = session.save(savedPerson);
        Serializable theEmployeeId = session.save(savedEmployee);
        session.getTransaction().commit();

        System.out.println(">>> Person use GenerationValue = Indentity  and has  Id= " +thePersonId);
        System.out.println(">>> Employe use UUID generator  and has  Id= " +theEmployeeId);



        session.close();
        factory.close();
    }

}
