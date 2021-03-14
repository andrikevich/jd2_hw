package it.academy.task13_14.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "T_PERSON")
@Data
@NoArgsConstructor
public class Person {

    @Id
    @GenericGenerator(name="gen-uuid",strategy = "uuid")
    @GeneratedValue(generator = "gen-uuid")
    @Column(name = "PERSON_ID")
    private String id;

    @Column(name="FIRST_NAME")
    private  String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name="AGE")
    private int age;
}
