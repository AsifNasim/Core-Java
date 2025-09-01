package Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private boolean isAvailable = false;

//    ReentrantLock lock = new ReentrantLock();
    public synchronized void produce(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock acquired by : "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch(Exception e){

        }

        finally {
            System.out.println("Lock Released by: "+ Thread.currentThread().getName());
            lock.unlock();

        }
//        System.out.println("Lock Released by: "+ Thread.currentThread().getName());
    }
}
