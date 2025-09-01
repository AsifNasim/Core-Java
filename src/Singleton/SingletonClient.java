package Singleton;

public class SingletonClient {
    public static void main(String[] args) {

        EagerInitialization conObj = EagerInitialization.getConnObj();
        System.out.println(conObj);
    }
}
