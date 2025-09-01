package Multithreading.SharedResource;


public class ConsumerTask implements Runnable{

    SharedResourceMulti sharedResourceMulti;

    ConsumerTask(SharedResourceMulti sharedResourceMulti){
        this.sharedResourceMulti = sharedResourceMulti;
    }

    @Override
    public void run(){
        System.out.println("Consumer Thread:" + Thread.currentThread().getName());
        sharedResourceMulti.consumeItem();
    }
}
