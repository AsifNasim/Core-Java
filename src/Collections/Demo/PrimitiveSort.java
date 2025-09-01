package Collections.Demo;

import java.util.Arrays;

public class PrimitiveSort {

    public static void main(String [] args){
        int [] arr = {4,3,2,1};

        Arrays.sort(arr);

        for(int elem: arr){
            System.out.println(elem);
        }

    }
}
