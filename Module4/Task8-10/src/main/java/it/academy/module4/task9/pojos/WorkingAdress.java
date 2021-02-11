package it.academy.module4.task9.pojos;

import it.academy.module4.task8_10.pojos.IAdress;
import lombok.*;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class WorkingAdress implements IAdress {

    private String officeStreet;

    private int officeBuildingNumber;

    private int officeRoomNumber;
}
