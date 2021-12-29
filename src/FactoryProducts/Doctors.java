package FactoryProducts;

import IFactory.IUsers;

public class Doctors implements IUsers {

    private Integer id;
    private int especialtyID;
    private int userID;
    private int shiftID;
    private Integer status;
    private String creationTime;
    private String modificationTime;
    private Integer userModifier;
    private int userCreatos;

    public void setValues(Integer id, int especialtyID, int userID, int shiftID, Integer status, String creationTime, String modificationTime, Integer userModifier, int userCreatos) {
        this.id = id;
        this.especialtyID = especialtyID;
        this.userID = userID;
        this.shiftID = shiftID;
        this.status = status;
        this.creationTime = creationTime;
        this.modificationTime = modificationTime;
        this.userModifier = userModifier;
        this.userCreatos = userCreatos;
    }

    @Override
    public void createUser() {
        Doctors nuewvoUsuario = new Doctors();
    }
}
