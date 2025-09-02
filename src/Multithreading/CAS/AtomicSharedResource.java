package Multithreading.CAS;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSharedResource {
    
    AtomicInteger counter = new AtomicInteger(0);

    public void increamentCount(){
        counter.incrementAndGet();
    }

    public int getVal(){
        return counter.get();
    }
}
