package Multithreading.StampedLock;

import Multithreading.StampedLock.SharedResource;


import java.util.concurrent.locks.StampedLock;

public class StampedLockClient {

    public static void main(String[] args) {
        StampedLock lock = new StampedLock();

        SharedResource sharedResource = new SharedResource();


        Thread t1 = new Thread( ()-> {
            sharedResource.producer(lock);
        });


        Thread t2 = new Thread(() -> {
            sharedResource.producer(lock);
        });

       SharedResource sharedResource1 = new SharedResource();
        Thread t3 = new Thread( () -> {
            sharedResource1.consumer(lock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
