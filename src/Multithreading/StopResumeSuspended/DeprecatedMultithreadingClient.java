package Multithreading.StopResumeSuspended;

public class DeprecatedMultithreadingClient {

    public static void main(String[] args) {

        DeprecatedMultithreading sharedResource = new DeprecatedMultithreading();
        System.out.println("main thread starting");
        Thread t1 = new Thread(()->{
            System.out.println("Thread 1 calling produce method");
            sharedResource.produce();
        });


        Thread t2 = new Thread(() -> {
            try {
//                 making it to sleep for 1 sec
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 2 is calling produce method");
            sharedResource.produce();
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        }catch (Exception e){
//            exception handled here
        }
        System.out.println("thread 1 suspended");
//        suspending the thread after 2 sec
        t1.suspend();

        try {
            Thread.sleep(5000);
        }catch (Exception e){
//            Exception handled here
        }
//         releasing the thread after 5 sec
        System.out.println("Thread 1 released");
        t1.resume();

        try{
            t1.join();
        }catch (Exception e){
//            Exception handled here
        }

        try{
            t2.join();
        }catch (Exception e){
//            Exception handled here
        }



        System.out.println("Main thread finishing its work");





    }
}
