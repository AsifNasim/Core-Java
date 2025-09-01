package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsclass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("max value: "+ Collections.max(list));
        System.out.println("min value: " + Collections.min(list));

        Collections.sort(list);

        System.out.println("Sorted");

        list.forEach((Integer val) -> System.out.println(val));
    }
}
