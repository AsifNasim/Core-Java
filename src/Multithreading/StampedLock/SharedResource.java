package Multithreading.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    int a =10;

    public void producer(StampedLock lock){
        long stamp = lock.tryOptimisticRead();

        try{
            System.out.println("Stamped lock taken");
            a = 11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Update done successfully");
            } else{

                System.out.println("rollback");
                a = 10;
            }
        } catch (Exception e){

        }
    }


    public void consumer(StampedLock lock){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by : "+ Thread.currentThread().getName());
        try {
            System.out.println("Work in progress");
            a = 9;
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by : "+ Thread.currentThread().getName());
        }


    }
}
