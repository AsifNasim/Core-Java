package Multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside main method: "+
                Thread.currentThread().getName());

//        creating the runnable object

        MultiThreadLearning runnableObj = new MultiThreadLearning();

//        creating the thread

        Thread thread = new Thread(runnableObj);
        thread.start();
//        this thread.start() internally call the run() method,
//        and if Thread has another argument passed inside the
//        constructor then it will override with the run method present inside
//        that method.
        System.out.println("Finish main method: " + Thread.currentThread().getName());



//        System.out.println("Starting main method: "+ Thread.currentThread().getName());
//
//        MultiThreadUsingExtend newThread = new MultiThreadUsingExtend();
//
//        newThread.start();
//
//        System.out.println("Finishing the main method: "+ Thread.currentThread().getName());

    }
}
