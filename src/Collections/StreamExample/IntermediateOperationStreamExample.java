package Collections.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationStreamExample {

    public static void main(String[] args) {

//        1. filter(Predicate<T> predicate) - It filters the element

        Stream<String> nameStream = Stream.of("Hello", "EveryBody", "How", "Are",
                "You");

        Stream<String> filteredStream = nameStream.filter((String name) -> name.length() <= 3);

        List<String> filteredName = filteredStream.collect(Collectors.toList());
        System.out.println("Filtered Name: "+ filteredName);

//        2. map(Function<T,R> mapper) - Used to transform each element

        Stream<String> nameStream2 = Stream.of("Hello", "EveryBody", "How", "Are",
                "You");

        Stream<String> nameStreamMap = nameStream2.map((String name) -> name.toLowerCase());
        List<String> listStreamMap = nameStreamMap.collect(Collectors.toList());
        System.out.println("Map Name: "+ listStreamMap);

//        3.flatMap (Function<T, Stream<R>> mapper) -> Used to iterate over each element of the
//        complex collection, and helps to flatten it.

        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "Love ", "Java"),
                Arrays.asList("Concepts", "Are", "Very", "Clear"),
                Arrays.asList("and", "easy", "to", "understand")
        );

        Stream<String> wordStream1 = sentenceList.stream().flatMap(
                (List<String> sentence) ->sentence.stream()
        );

        Stream<String> wordStream2 = sentenceList.stream().flatMap(
                (List<String> sentence) -> sentence.stream().map(
                        (String val )-> val.toLowerCase()
                )
        );

//        4. Distinct() -> Removes duplicate from the stream

        Integer [] arr = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream = Arrays.stream(arr).distinct();

//        5. Sorted() ->  sort the elements
        Integer [] arr2 = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream2 = Arrays.stream(arr).sorted();

//        6. peek(Consumer<T> action) -> Helps you to see the intermediate result of the
//        stream which is getting processed

        List<Integer> numbers = Arrays.asList(2,1,3,4,6);

        Stream<Integer> numberStream = numbers.stream()
                .filter( (Integer val) ->  val > 2)
                .peek((Integer val) -> System.out.println("Intermediate value" +val))
                .map((Integer val) -> -1*val);

        List<Integer> terminalOperation = numberStream.collect(Collectors.toList());

//        7. limit(long maxSize) - truncate the stream, to have no longer than given max size

        List<Integer> numbers2 = Arrays.asList(2,1,3,4,6);

        Stream<Integer> limitStream = numbers2.stream().limit(3);

        List<Integer> terminalOutput = limitStream.collect(Collectors.toList());
        System.out.println("Terminal Output: limit ->" +terminalOutput);

//        8. skip (long n) -> skip the first n elements of the stream
        List<Integer> numbers3 = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numbersStream3 = numbers3.stream().skip(3);
        List<Integer> terminalOutput3 = numbersStream3.collect(Collectors.toList());
        System.out.println("Terminal output for skip ->" +terminalOutput3);

//        9. mapToInt(ToIntFunction<T> mapper) - helps to work with primitive "int" datatype

        List<String> numbers4 = Arrays.asList("2","1","3","4","6");
        IntStream numberStream4 = numbers4.stream()
                .mapToInt( (String val) -> Integer.parseInt(val));

        int [] numArray = numberStream4.toArray();

        for(int elem: numArray){
            System.out.println(elem);
        }

//        10. mapToLong(ToLongFunction<T> mapper) - helps to work with primitive
//        "long" datatype

//        11. mapToDouble(ToDoubleFunction<T> mapper) - helps to work with primitive
//        "double" datatype


    }
}
