package Constructor;

public class PrivateConstructorSingleton {
//    1. Using private constructor in the singleton pattern

    private static PrivateConstructorSingleton INSTANCE;

    private String info = "Initial info class";

    private PrivateConstructorSingleton(){

    }

    public static PrivateConstructorSingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new PrivateConstructorSingleton();
        }

        return INSTANCE;
    }
}
