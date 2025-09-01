package Collections.StreamExample;

import java.util.List;
import java.util.Arrays;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential Stream
        long startTime = System.nanoTime();
        int sumSequential = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long endTime = System.nanoTime();
        System.out.println("Sum (Sequential): " + sumSequential);
        System.out.println("Time taken (Sequential): " + (endTime - startTime) + " ns");

        // Parallel Stream
        startTime = System.nanoTime();
        int sumParallel = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        endTime = System.nanoTime();
        System.out.println("Sum (Parallel): " + sumParallel);
        System.out.println("Time taken (Parallel): " + (endTime - startTime) + " ns");
    }
}

