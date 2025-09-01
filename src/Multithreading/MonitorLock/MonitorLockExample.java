package Multithreading.MonitorLock;

public class MonitorLockExample {

    synchronized public void method1(){
        try{
            System.out.println("Monitor lock starts");
            System.out.println("Inside task 1");
            Thread.sleep(5000);
            System.out.println("Task 1 completed");
            System.out.println("Monitor lock removed");
        }
        catch (Exception e){

        }
    }


    public void method2(){
        System.out.println("Task 2, but before synchronised");
        synchronized (this){
            System.out.println("task 2 inside synchronised");
        }
    }

    public void method3(){
        System.out.println("Task3");
    }
}
