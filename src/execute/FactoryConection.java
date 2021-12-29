package execute;

import FactoryProducts.Users;
import FactoryProducts.Patients;
import FactoryProducts.Doctors;
import IFactory.IUsers;

public class FactoryConection {

    public IUsers create(String typeUser){
        if(typeUser.equalsIgnoreCase("doctor")){
            return new Users();
        }
        if(typeUser.equalsIgnoreCase("patient")){
            return new Patients();
        }
        return new Doctors();
    }
}
