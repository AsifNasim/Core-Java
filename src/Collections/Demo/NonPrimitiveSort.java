package Collections.Demo;

import java.util.Arrays;

public class NonPrimitiveSort {
    public static void main(String[] args) {
        Integer [] arr = {9,3,5,1,2};
        Arrays.sort(arr, (Integer a, Integer b) -> a-b);
//        Both are same
        Arrays.sort(arr);

        for(Integer v1: arr){
            System.out.println(v1);
        }
    }
}
