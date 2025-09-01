package Collections;

import java.util.PriorityQueue;

public class maxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

//        let's print all the values
        maxPQ.forEach((Integer val) -> System.out.println(val));

        while (!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("Removed from the top: " + val);
        }

    }
}
