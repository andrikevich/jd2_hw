package it.academy.module4.task8_10.pojos;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Component
public class Adress implements IAdress {

    private String city;

    private String street;

    private int zipCode;

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
