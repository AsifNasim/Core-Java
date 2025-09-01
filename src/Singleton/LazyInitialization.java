package Singleton;

public class LazyInitialization {

    private static LazyInitialization connObj;

    private LazyInitialization(){

    }

    public static LazyInitialization getConnObj(){
        if(connObj == null){
            connObj = new LazyInitialization();
        }
        return connObj;
    }

//    only issue is when two thread T1 and T2 checks the connObj simultaneously then it will find that
//    connObj is null, and it will create two object which we don't want
}
