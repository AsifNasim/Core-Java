package Multithreading.SharedResource;

public class SharedResourceMulti {

    public boolean isItemAvailable = false;

    public synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Item added by " + Thread.currentThread().getName()+" and " +
                "invoking all threads which are waiting");
        notifyAll();
    }

    public synchronized void consumeItem(){

        System.out.println("Consume method invoked by: "+ Thread.currentThread().getName());
        while (!isItemAvailable){
            try{
                System.out.println("Thread " + Thread.currentThread().getName()+" is " +
                        "waiting now");
                wait();
            }
            catch(Exception e){
//                Throw exception
            }


        }
        System.out.println(" Item Consumed by: "+ Thread.currentThread().getName());
        isItemAvailable = false;

    }
}
