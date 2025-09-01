package Collections.LearnMap;

import java.util.*;

public class LinkedHashMapLearn {
    public static void main(String[] args) {

        System.out.println("Below is the Linked Hashmap output");
        Map<Integer, String>  linkedHashMapObj = new LinkedHashMap<>();
        linkedHashMapObj.put(1,"A");
        linkedHashMapObj.put(21,"B");
        linkedHashMapObj.put(56,"C");
        linkedHashMapObj.put(47,"D");
        linkedHashMapObj.put(134,"E");

        for (Map.Entry<Integer, String> entryObj: linkedHashMapObj.entrySet()){
            System.out.println("Key: "+ entryObj.getKey()+ "Value: "+ entryObj.getValue());
        }


        System.out.println("Below is the Normal Hashmap output");
        Map<Integer, String>  normalHashMapObj = new HashMap<>();
        normalHashMapObj.put(1,"A");
        normalHashMapObj.put(21,"B");
        normalHashMapObj.put(56,"C");
        normalHashMapObj.put(47,"D");
        normalHashMapObj.put(134,"E");

        for (Map.Entry<Integer, String> entryObj2: normalHashMapObj.entrySet()){
            System.out.println("Key: "+ entryObj2.getKey()+ "Value: "+ entryObj2.getValue());
        }

//        There is no thread safe version present for this.
//        In order to make LinkedHashMap thread safe, we need to
//        utilize the collections.synchronised map

        System.out.println("-----Maintaining accessing order----");
        Map<Integer, String> linkedHashAccessOrder = new LinkedHashMap<>(16, .75F, true);
        linkedHashAccessOrder.put(1,"A");
        linkedHashAccessOrder.put(21,"B");
        linkedHashAccessOrder.put(56,"C");
        linkedHashAccessOrder.put(47,"D");
        linkedHashAccessOrder.put(134,"E");



        linkedHashAccessOrder.get(56);
        linkedHashAccessOrder.forEach((Integer key, String val) -> {
            System.out.println("Key: "+ key + "Value: "+ val);
        });

        System.out.println("Most access element has been put to the last");

        Map<Integer, String> linkedSafeHashMap = Collections.synchronizedMap(new LinkedHashMap<>());




    }
}
