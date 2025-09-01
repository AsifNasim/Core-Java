package HeapMem;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {
//    A weak reference allows an object to be garbage collected even if the
//    reference is still accessible.
//    They are used in the situation like caching to avoid memory leaks.

    public static void main(String[] args) {


        String strongRef = new String("Weak Reference Example");

        //      Creating the weak reference
        WeakReference<String> weakReference = new WeakReference<>(strongRef);

//        clear the strong reference

        strongRef = null;

//        Garbage collection may claim the object

        System.gc();

//        weakReference might return null if the object is garbage collected
        System.out.println("Weak Reference:" + weakReference.get());





    }

}
