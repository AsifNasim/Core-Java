package Multithreading.SharedResource.Assignment;





import java.util.LinkedList;
import java.util.Queue;

public class SharedResourceAsgn {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    SharedResourceAsgn(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void producer(int item) throws InterruptedException {

//        check if the queue is full
        while (sharedBuffer.size() == bufferSize){
            System.out.println("Make this thread wait till it has some space left it");
            wait();
        }

        sharedBuffer.add(item);
        notify();
    }

    public synchronized int consumer() throws InterruptedException{
        // check if the sharedBuffer queue is empty
        while (sharedBuffer.size() == 0){
            System.out.println("Since the ,buffer is empty so we cannot consume anything " +
                    "from it, hence keeping this thread on wait unless the queue has some value " +
                    "in it");
            wait();
        }

        int item = sharedBuffer.poll();
        System.out.println("Consumed :"+ item);
        notify();
        return item;
    }
}
