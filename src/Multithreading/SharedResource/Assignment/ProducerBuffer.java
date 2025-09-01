package Multithreading.SharedResource.Assignment;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerBuffer  {

    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);


    public synchronized void enqueueElements(){
        while (queue.size() > 0){
           boolean addedElem =  queue.offer((int) Math.random()*10);
            System.out.println("Element added: "+ addedElem);
            if (queue.remainingCapacity() == 0){
                try {
                    wait();
                } catch (Exception e){
//                    Throw exception over here
                }
            }

        }

    }


    public synchronized void dequeueElements(){
        while (!queue.isEmpty()){
            int elem = queue.poll();
            System.out.println("Element removed from the queue: "+ elem);

            if (queue.isEmpty()){

            }
        }

    }




}
