package it.academy.module4.task9.pojos;

import it.academy.module4.task8_10.pojos.IAdress;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Factory {

   private  String name;

   @Autowired
   @Qualifier(value = "workingAdress")
   private IAdress factoryAdress;


}
