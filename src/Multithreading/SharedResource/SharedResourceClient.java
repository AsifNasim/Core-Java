package Multithreading.SharedResource;

public class SharedResourceClient {

    public static void main(String[] args) {
        System.out.println("Main Method start");

        SharedResourceMulti sharedResourceMulti = new SharedResourceMulti();

//        Producer Thread
        Thread producerThread = new Thread(new ProducerTask(sharedResourceMulti));

//        Consumer Thread

        Thread consumerThread = new Thread(new ConsumerTask(sharedResourceMulti));


//        Thread is in runnable state
        producerThread.start();
        consumerThread.start();


    }
}
