package Singleton;

public class SynchronizationBlock {

    private static SynchronizationBlock connObj;

    private SynchronizationBlock(){

    }

    synchronized public static SynchronizationBlock getConnObj(){
        if(connObj == null){
            connObj = new SynchronizationBlock();
        }
        return connObj;
    }

//    It works on the principle of lock and unlock, and if getConnObj is being called at many places sequentially then it will
    // always first lock and unlock and thus making the operation slow
}
