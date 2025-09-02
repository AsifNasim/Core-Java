package Multithreading.CAS;

public class AtomicSharedResourceClient {

    public static void main(String[] args) {
        AtomicSharedResource sharedResource = new AtomicSharedResource();

        Thread t1 = new Thread( () ->{
                for (int i = 0; i < 200; i++) {
                sharedResource.increamentCount();
            }
        });

        

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 200; i++) {
            sharedResource.increamentCount();
                
            }
        } );


        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch(Exception e){

        }


        System.out.println("Using Atomic Thread : "+ sharedResource.getVal());
    }
    
}
