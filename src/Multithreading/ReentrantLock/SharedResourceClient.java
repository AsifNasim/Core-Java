package Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceClient {

    public static void main(String[] args) {

        SharedResource sharedResource1 = new SharedResource();
        ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            sharedResource1.produce(lock);
        });

        SharedResource sharedResource2 = new SharedResource();
        Thread t2 = new Thread(() -> {
            sharedResource2.produce(lock);
        });

        t1.start();
        t2.start();
    }
}
