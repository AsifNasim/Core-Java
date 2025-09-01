package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CollectionClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Size: "+ list.size());
        System.out.println("IS Empty: "+ list.isEmpty());

        System.out.println("Contains: " + list.contains(5));
        list.add(5);
        System.out.println("added: " + list.contains(5));

        //remove the value at index 3
        list.remove(3);

//        remove using object, it removes the first occurrence

        list.remove(Integer.valueOf(3));

        System.out.println("removed using object: " + list.contains(3));

        Stack<Integer> stackObj = new Stack<>();

        stackObj.add(6);
        stackObj.add(7);
        stackObj.add(8);
        stackObj.add(9);

//        size
        System.out.println("Size: "+ stackObj.size());

        System.out.println("Contains: "+ stackObj.contains(10));

        stackObj.add(10);

        System.out.println("Contains: " + stackObj.contains(10));

        stackObj.remove(3);

        System.out.println(stackObj.peek());

        list.addAll(stackObj);

        System.out.println("add all test using containsAll(): " + list.containsAll(stackObj));

        list.clear();

        System.out.println("Clearing all values: " + list.isEmpty());










    }
}
