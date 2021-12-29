package execute;

import FactoryProducts.Doctor;
import FactoryProducts.Employee;
import FactoryProducts.Recepcionist;
import IFactory.IUsers;

public class FactoryConection {

    IUsers user;

    public IUsers create(String typeUser){
        if(typeUser.equalsIgnoreCase("doctor")){
            return new Doctor();
        }
        if(typeUser.equalsIgnoreCase("employee")){
            return new Employee();
        }
        return new Recepcionist();
    }
}
