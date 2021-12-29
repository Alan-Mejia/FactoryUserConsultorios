package execute;

public class Main {
    public static void main(String[] args){
        FactoryConection user = new FactoryConection();
        FactoryConection user2 = new FactoryConection();
        user.create("doctor");
        user2.create("patient");
    }
}
