package Multithreading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    private boolean isAvailable = false;

    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println(" Read Lock Acquired : "+ Thread.currentThread().getName());
            Thread.sleep(8000);
        } catch (Exception e){

        }
        finally {
            System.out.println("Read Lock released : "+ Thread.currentThread().getName());
            lock.readLock().unlock();
        }


    }

    public void consume(ReadWriteLock lock){
        try {

            lock.writeLock().lock();
            System.out.println("Write Lock Acquired : "+ Thread.currentThread().getName());
            isAvailable = true;
        } catch (Exception e){

        }

        finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock released : "+ Thread.currentThread().getName());
        }

    }
}
