package it.academy.module4.task8_10.pojos;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Person {

    private String passportId;

    private String firstName;

    private String lastName;

    @Autowired(required = true)
    private IAdress adress;
}
