package Multithreading.StopResumeSuspended;

public class DeprecatedMultithreading {

    private boolean isAvailable = false;

    public synchronized void produce(){
        isAvailable = true;

        System.out.println("Lock Acquired");

        try{
            Thread.sleep(8000);
        } catch (Exception e){
//            Exception handled here
        }
        System.out.println("Lock Released");
    }
}
