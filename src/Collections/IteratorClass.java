package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {

    public static void main(String[] args) {
        List<Integer> valuesList = new ArrayList<>();
        valuesList.add(1);
        valuesList.add(2);
        valuesList.add(3);
        valuesList.add(4);

//        return the object for iterator
        Iterator<Integer> valueIterator = valuesList.iterator();

        while (valueIterator.hasNext()){
            int val = valueIterator.next();
            System.out.println("Iterating "+val);

            if(val == 3){
                valueIterator.remove();
            }
        }

        while (valueIterator.hasNext()){
            int tempValues = valueIterator.next();
            System.out.println("Iterating temp values -->"+tempValues);
        }

        System.out.println("Iterating the values using for each loop");

        for(int val: valuesList){
            System.out.println(val);
        }

//      using for each method -- Lambda Expression

        System.out.println("Testing for each method");
        valuesList.forEach((Integer val) -> System.out.println("using lambda -->"+val));


    }
}
