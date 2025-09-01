package Collections;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {

//        If we don't pass anything in the constructor then
//        it acts somewhat as min heap
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        minPQ.add(2);
        minPQ.add(5);
        minPQ.add(1);
        minPQ.add(8);

//        it prints it in level order traversal
        minPQ.forEach((Integer val) -> System.out.println(val));

//        removed the data in ascending order
        while (!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("removed value -->" +val);
        }


    }
}
