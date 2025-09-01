package Multithreading.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    private boolean isAvailable = false;

    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e){
//
        } finally {
            lock.release();
            System.out.println("Lock released by : "+ Thread.currentThread().getName());
        }
    }
}
