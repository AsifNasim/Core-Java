package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class ThreadSafeVersions {

    public static void main(String[] args) {

//      Priority Queue Thread safe version

        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);

        pbq.forEach((Integer val) -> System.out.println("Thread safe PBQ -> " + val));

        ConcurrentLinkedDeque<Integer> clq = new ConcurrentLinkedDeque<>();
        clq.addFirst(5);
        clq.addLast(6);
        clq.removeFirst();

        clq.forEach((Integer clqVal) -> System.out.println("Thread Safe CLQ -> "+clqVal));



//      Linked list thread safe version
        CopyOnWriteArrayList<Integer> myNewList = new CopyOnWriteArrayList<>();
        myNewList.add(0, 100);
        System.out.println(myNewList.get(0));

//      Vector is Thread no use any thread safe method

        Vector<Integer> vectorObj = new Vector<>();
        vectorObj.add(0, 175);
        System.out.println(vectorObj.get(0));

//      Stack is the child of Vector Concrete Class

        Stack<Integer> stack = new Stack<>();
        stack.push(123);
        stack.push(456);
        stack.push(789);
        stack.push(987);

        stack.pop();
        stack.forEach((Integer val )-> System.out.println(val));



    }
}
