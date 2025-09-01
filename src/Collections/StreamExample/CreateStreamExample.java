package Collections.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
//       1. From Collection

        List<Integer> salaryList = Arrays.asList(3000, 4000, 2000, 11000, 9000);
        Stream<Integer> streamFromIntegerList = salaryList.stream();

        List<Integer> outputSalList = streamFromIntegerList.collect(Collectors.toList());
        System.out.println(outputSalList);

//        2. From Array:
        Integer [] salaryArray = {3000, 4000, 2000, 11000, 9000};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);

//        3. From Static Method

        Stream<Integer> streamFromStaticMethod = Stream.of(3000, 4000, 2000, 11000, 9000);

//        4. FromStreamBuilder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(100).add(200).add(400).add(300);

        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();

//        5. From Stream Iterate

        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n+5000).limit(5);

        List<Integer> terminalStreamFromIterate = streamFromIterate.collect(Collectors.toList());
        System.out.println(terminalStreamFromIterate);



    }
}
