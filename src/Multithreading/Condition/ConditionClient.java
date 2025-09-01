package Multithreading.Condition;

public class ConditionClient {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread( () ->{
            for (int i = 0; i< 3; i++){
                sharedResource.producer();
            }
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i  <= 3; i++ ){
                sharedResource.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}
