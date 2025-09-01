package Multithreading.SharedResource.Assignment;

public class SharedResourceAsgnClient {
    public static void main(String[] args) {
        SharedResourceAsgn sharedResource = new SharedResourceAsgn(3);

//        producer thread
        Thread producerThread = new Thread(() -> {
            try {
                for(int i = 1; i <= 6; i++){
                    sharedResource.producer(i);
                }
            } catch (Exception e){
//                 throw some exception
            }
        });


//        Consumer Thread
      Thread consumerThread = new Thread(() -> {
          try{
              for (int i =1; i <=6; i++){
                  sharedResource.consumer();
              }
          } catch(Exception e){

          }
      });

        producerThread.start();
        consumerThread.start();
    }
}
