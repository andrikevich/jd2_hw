package by.it.pojos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Employee {


    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid")
    @GeneratedValue(generator = "uuid-gen")
    @Column
    private  String employeeId;



    private  String department;

    @Column
    @Access(AccessType.FIELD)
    private String login;

    @Column
    @Access(AccessType.FIELD)
    private String password;

    @Transient
    @Column
    private String phoneNumber;

    public Employee(String department, String login, String password, String phoneNumber) {
        this.department = department;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Column (name = "DEPARTMENT")
    @Access( AccessType.PROPERTY)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    // this part of code is according to Task 7 of Module-3


    public Employee(String department, String login, String password, String phoneNumber, Adress adress) {
        this.department = department;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    @Embedded
    private Adress adress;
}
