package Multithreading;

public class MultiThreadLearning implements Runnable {

//    this method will get invoked when we run thread.start();

/*   if runnable object is passed into it, it will understand it as runnable target and hence run below run method
* see main class */


    @Override
    public void run(){
        System.out.println("Code executed by thread: "+ Thread.currentThread().getName());

    }
}
