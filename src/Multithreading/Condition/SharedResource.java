package Multithreading.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    private boolean isAvailable = true;

    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer(){
        try {
            lock.lock();
            System.out.println("Producer lock acquired by : "+ Thread.currentThread().getName());

            if (isAvailable){
//
                System.out.println("Producer thread will wait : "+ Thread.currentThread().getName());
                condition.await();
            }

            isAvailable = true;
            condition.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         finally {
            lock.unlock();
            System.out.println("Producer lock released by :"+ Thread.currentThread().getName());
        }
    }

    public void consumer(){

        try{
            lock.lock();
            System.out.println("consumer lock acquired by : "+ Thread.currentThread().getName());
            Thread.sleep(2000);

            if(!isAvailable){
                System.out.println("consumer lock is waiting for resource to free up");
                condition.await();
            }

            isAvailable = false;
            condition.signal();

        } catch (Exception e){
//
        } finally {
            System.out.println("Consumer lock released by : "+ Thread.currentThread().getName());
            lock.unlock();
        }


    }
}
