package Multithreading.InterThreadCommunication;

public class SharedResource {

    boolean isItemPresent = false;

    public void addItem(){
        isItemPresent = true;
    }

    public void consumeItem(){
        isItemPresent = false;
    }
}
