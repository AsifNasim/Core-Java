package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
//        using dequeue functionality
        list.addFirst(100);
        list.addLast(200);
        list.addLast(300);
        list.addFirst(400);

        System.out.println(list.getFirst());

//        using list functionality
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,300);
        list2.add(1,400);
        list2.add(2, 500);
        list2.add(1, 600);
        list2.add(3, 700);

        System.out.println(list2.getFirst());



    }
}
