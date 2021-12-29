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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    public Integer getUserModifier() {
        return userModifier;
    }

    public void setUserModifier(Integer userModifier) {
        this.userModifier = userModifier;
    }

    @Override
    public void createUser() {
        Recepcionist nuewvoUsuario = new Recepcionist();
    }
}
