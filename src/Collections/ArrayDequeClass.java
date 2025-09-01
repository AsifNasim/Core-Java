package Collections;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();

//        Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(2);
        arrayDequeAsQueue.addLast(3);
        arrayDequeAsQueue.addLast(10);

//        Deletion

        int element = arrayDequeAsQueue.removeFirst();
        System.out.println(element);

//         LIFO(Last in First Out)
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();

        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(9);
        arrayDequeAsStack.addFirst(12);
        arrayDequeAsStack.addFirst(17);

        int elem = arrayDequeAsStack.removeFirst();
        System.out.println(elem);

    }
}
