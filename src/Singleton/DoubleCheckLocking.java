package Singleton;

public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking connObj;

//    by using volatile it will solve the memory issue and read/write
//    will happen directly from Memory and not from cache.

    private DoubleCheckLocking(){

    }

   public static DoubleCheckLocking getConnObj(){
        if(connObj == null){
            synchronized (DoubleCheckLocking.class){
                if(connObj == null){
                    connObj = new DoubleCheckLocking();
                }
            }
        }

        return connObj;
   }
}
