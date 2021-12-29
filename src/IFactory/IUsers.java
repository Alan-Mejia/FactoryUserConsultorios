package IFactory;

public interface IUsers {
    void createUser();
    void setValues(Integer id, String name, String lastName, String surname, String email, Integer role, String userName, String password, Integer status, String creationTime, String modificationTime, Integer userModifier);

}
