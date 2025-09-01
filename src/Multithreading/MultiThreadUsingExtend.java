package Multithreading;

public class MultiThreadUsingExtend extends Thread{

    @Override
    public void run(){
        System.out.println("Code Executed by thread: "+ Thread.currentThread().getName());
    }

}
