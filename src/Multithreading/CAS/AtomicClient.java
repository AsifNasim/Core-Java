package Multithreading.CAS;

public class AtomicClient {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

//        for (int i = 0; i < 400; i++) {
//            sharedResource.increamentCounter();
//        }
//
//        System.out.println(sharedResource.get());

//        what if we have multiple threads

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                sharedResource.increamentCounter();
            }
        });

        Thread t2 = new Thread( ()-> {
            for (int i = 0; i < 200; i++) {
                sharedResource.increamentCounter();
            }
        });

        t1.start();
        t2.start();



        try {
            t1.join();
            t2.join();
        } catch (Exception e){
//
        }

        System.out.println("Using Thread : "+ sharedResource.get());
    }
}
