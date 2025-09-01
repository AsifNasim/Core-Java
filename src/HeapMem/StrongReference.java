package HeapMem;

public class StrongReference {

    public static void main(String[] args) {
//        1. A strong reference is the default reference type in as long as an
//        object has strong reference it will not be garbage collected.


//        Creating a strong reference
        String strongReference = new String(("String Reference Example"));

//        The object cannot be garbage collected until 'strong reference' is set to null
        System.out.println(strongReference);
//        Output: Strong reference example

    }
}
