package HeapMem;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {
//    A soft reference is similar to weak reference only difference is it is less
//    aggressive. The GC only reclaims softly reachable objects when the JVM is low
//    on memory. Soft references are useful for implementing memory sensitive caches

    public static void main(String[] args) {

        String strongRef = new String("Strong reference");

//        Creating soft Reference

        SoftReference<String> softReference = new SoftReference<>(strongRef);

//        making it null

        strongRef = null;

//        Garbage collecting

        System.gc();

        if(softReference.get() != null){
            System.out.println("Soft Reference: " + softReference.get());
        }else{
            System.out.println("Object has been garbage collected");
        }
    }
}
