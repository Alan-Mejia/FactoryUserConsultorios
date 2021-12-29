package FactoryProducts;

import IFactory.IUsers;

import java.sql.Time;
import java.util.Date;

public class Patients implements IUsers {

    private int id;
    private String name;
    private String lastName;
    private String surname;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private int status;
    private Date creationTime;
    private Time modificationTime;
    private int userModifier;
    private int userCreator;


    @Override
    public void createUser() {
        Patients user = new Patients();
    }

    public void setValues(int id, String name, String lastName, String surname, int age, String gender, String email, String phoneNumber, int status, Date creationTime, Time modificationTime, int userModifier, int userCreator) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.creationTime = creationTime;
        this.modificationTime = modificationTime;
        this.userModifier = userModifier;
        this.userCreator = userCreator;
    }
}
