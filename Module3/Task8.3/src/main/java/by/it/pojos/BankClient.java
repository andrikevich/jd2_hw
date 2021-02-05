package by.it.pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class BankClient extends Person {


    private String bankName;

    private long account;


    public BankClient( Integer age, String name, String surname, Adress adress, String bankName, long account) {
        super(age, name, surname, adress);
        this.bankName = bankName;
        this.account = account;
    }
}
