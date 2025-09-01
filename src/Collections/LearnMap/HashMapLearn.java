package Collections.LearnMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {

    public static void main(String[] args) {
        Map<Integer, String> rollNoNameMap = new HashMap<>();
//        Since I have not passed any size in the HashMap, so it will take the default size
//        of 16

        rollNoNameMap.put(null, "TEST");
        rollNoNameMap.put(0, null);
        rollNoNameMap.put(1, "A");
        rollNoNameMap.put(2, "B");
        rollNoNameMap.put(3, "C");

//        Iterating over the Map using sub-class Interface

        for(Map.Entry<Integer, String> entryMap: rollNoNameMap.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + " Value: "+ value);
        }

//        isEmpty
        System.out.println("isEmpty: "+ rollNoNameMap.isEmpty());

//        size
        System.out.println("Size of the mapObject: " + rollNoNameMap.size() );

//        contains key
        System.out.println("containsKey(3): "+ rollNoNameMap.containsKey(3) );

//        contains value
        System.out.println("Contains value(B): "+ rollNoNameMap.containsValue("B"));

//        Get key
        System.out.println("get(1): "+ rollNoNameMap.get(1));

//        Get Default
        System.out.println("get(9): "+ rollNoNameMap.getOrDefault(9, "it is not present"));

//        remove key
        System.out.println("remove null: "+ rollNoNameMap.remove(null));

//        Post removing null elements

        for(Map.Entry<Integer, String> entryMap: rollNoNameMap.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + " Value: "+ value);
        }

//        KeySet

        for (Integer key :
                rollNoNameMap.keySet()){
            System.out.println("Key: "+ key);
        }

//        Values

        for (String val :
                rollNoNameMap.values()) {
            System.out.println("Values: "+ val);
        }

        Collection<String> values = rollNoNameMap.values();
        for (String val :
                rollNoNameMap.values()) {
            System.out.println("Values: "+ val);
        }



    }
}
