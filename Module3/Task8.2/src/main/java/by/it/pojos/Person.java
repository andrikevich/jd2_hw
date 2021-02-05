package by.it.pojos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Person implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer age;

    @Column
    private String name;

    @Column
    private String surname;

    public Person(Integer age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    // this part of code is according to Task 7 of Module-3
    @Embedded
    private Adress adress;

    public Person(Integer age, String name, String surname, Adress adress) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }
}
