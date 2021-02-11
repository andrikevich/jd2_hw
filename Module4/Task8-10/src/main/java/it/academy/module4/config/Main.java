package it.academy.module4.config;

import it.academy.module4.task8_10.pojos.Person;
import it.academy.module4.task9.pojos.Factory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MainConfig.class);

        Person person = context.getBean("person", Person.class);

        Factory factory = context.getBean("factory",Factory.class);


        context.close();
    }
}
