package Collections.LearnMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapLearn {
    public static void main(String[] args) {

//        Creating Tree Map in descending order
//        It uses Red-Black tree internally
        Map<Integer, String> map1 = new TreeMap<>((Integer key1, Integer key2) -> key2-key1);

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        map1.forEach((Integer key, String val) -> {
            System.out.println("Key: "+ key + "Value" + val);
        } );

        System.out.println("---------Separator-----------");

        Map<Integer, String> map2 = new TreeMap<>();

        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");

        map2.forEach((Integer key, String val) -> {
            System.out.println("Key: "+ key + "Value" + val);
        } );


//        extra 4 methods provided with this SortedMap

        SortedMap<Integer, String> sortedMapObj = new TreeMap<>();
        sortedMapObj.put(1,"B");
        sortedMapObj.put(3,"C");
        sortedMapObj.put(13,"D");
        sortedMapObj.put(2,"E");
        sortedMapObj.put(9,"A");
//
//        to key is exclusive
        System.out.println(sortedMapObj.headMap(13));
//        from key is inclusive
        System.out.println(sortedMapObj.tailMap(3));

        System.out.println(sortedMapObj.firstKey());
        System.out.println(sortedMapObj.lastKey() );

    }
}
