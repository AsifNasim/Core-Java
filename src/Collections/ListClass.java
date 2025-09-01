package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        list.add(100);
        list.add(200);
        list.add(300);
        List<Integer> list2 = new ArrayList<>();

        list2.add(500);
        list2.add(600);
        list2.add(700);

        list.addAll(2, list2);

        list.forEach((Integer val) -> {
            System.out.println(val);
        });
//        Replace all it uses uniary op
        list.replaceAll((Integer val) -> -1*val);
        System.out.println("after using replaceAll()");
        list.forEach((Integer val) -> System.out.println(val));

//      sort(using comparator)

        list.sort((Integer a, Integer b) -> a-b);

        System.out.println("after using sorting");
        list.forEach((Integer val) -> System.out.println(val));

        list.set(2, -2200);
//        after set method
        list.forEach((Integer val) -> System.out.println(val));

//        after using remove() method
        list.remove(2);
        System.out.println("after removing element");
        list.forEach((Integer val) -> System.out.println(val));

//        Traversing forward using listIterator
        ListIterator<Integer> listIter = list.listIterator();
        while (listIter.hasNext()){
            int val = listIter.next();
            System.out.println("Traversing forward: " + val +" nextIndex: "
                    + listIter.nextIndex() + " previous index: "
                    + listIter.previousIndex());

            if(val == -200){
                listIter.add(-150);
            }
        }
//      need to provide the index in listIterator, from where it has to start the list
        ListIterator<Integer> listIter1 = list.listIterator(list.size());

        while (listIter1.hasPrevious()){
            int val = listIter1.previous();
            System.out.println("Traversing backward: " + val +" nextIndex: "
                    + listIter1.nextIndex() + " previous index: "
                    + listIter1.previousIndex());
            if (val == -100){
                listIter1.set(-50);
            }
        }

        list.forEach((Integer val) -> System.out.println("val after applying traversing " +
                val));




    }
}
