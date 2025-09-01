package Multithreading.CAS;

public class SharedResource {

    private int counter;

    public void increamentCounter(){
        counter++;
    }

    public int get(){
        return this.counter;
    }
}
