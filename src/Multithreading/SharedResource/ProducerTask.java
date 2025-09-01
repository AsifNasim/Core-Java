package Multithreading.SharedResource;

public class ProducerTask implements Runnable{
    SharedResourceMulti sharedResourceMulti;

    ProducerTask(SharedResourceMulti sharedResourceMulti){
        this.sharedResourceMulti = sharedResourceMulti;
    }

    @Override
    public void run() {
        System.out.println("Producer thread: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){
//            Throw exception
        }

        sharedResourceMulti.addItem();
    }
}
