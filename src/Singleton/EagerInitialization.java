package Singleton;

public class EagerInitialization {

    private static EagerInitialization connObj = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getConnObj(){
        return connObj;
    }

//    downfall is even if you are not using it, it will get created and takes memory space

}
