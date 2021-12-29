package FactoryProducts;

import IFactory.IUsers;

public class Employee implements IUsers {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    public void setUserModifier(Integer userModifier) {
        this.userModifier = userModifier;
    }

    @Override
    public void createUser() {
        Employee user = new Employee();
    }

    @Override
    public void setValues(Integer id, String name, String lastName, String surname, String email, Integer role, String userName, String password, Integer status, String creationTime, String modificationTime, Integer userModifier) {
        setId(id);
        setName(name);
        setLastName(lastName);
        setSurname(surname);
        setEmail(email);
        setRole(role);
        setUserName(userName);
        setPassword(password);
        setCreationTime(creationTime);
        setUserModifier(userModifier);
    }
}
