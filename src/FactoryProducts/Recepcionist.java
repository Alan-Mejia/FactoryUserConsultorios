package FactoryProducts;

import IFactory.IUsers;

public class Recepcionist implements IUsers {

    private Integer id;
    private String name;
    private String lastName;
    private String surname;
    private String email;
    private Integer role;
    private String userName;
    private String password;
    private Integer status;
    private String creationTime;
    private String modificationTime;
    private Integer userModifier;

    @Override
    public void setValues(Integer id, String name, String lastName, String surname, String email, Integer role, String userName, String password, Integer status, String creationTime, String modificationTime, Integer userModifier) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.email = email;
        this.role = role;
        this.userName = userName;
        this.password = password;
        this.creationTime = creationTime;
        this.userModifier = userModifier;
    }

    @Override
    public void createUser() {
        Recepcionist nuewvoUsuario = new Recepcionist();
    }
}
