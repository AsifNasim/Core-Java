import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int row = s.nextInt();
//        int col = s.nextInt();
//
//
//        int [][] arr2D = new int[row][col];
//
////        Taking multi dimensional Array input
//        for(int i =0; i < arr2D.length; i++){
//            for (int j = 0; j < arr2D[i].length  ; j++) {
//                arr2D[i][j] = s.nextInt();
//            }
//        }

//        Printing multi dimensional array

//        for(int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D[i].length; j++) {
//                System.out.print(arr2D[i][j] + " ");
//            }
//
//            System.out.println();
//        }


//        printing using Array.toString
//        for (int i = 0; i < arr2D.length; i++) {
//            System.out.println(Arrays.toString(arr2D[i]));
//
//        }

//        print using enhanced loop

//        for (int [] num: arr2D) {
//            System.out.println(Arrays.toString(num));
//        }

//        initialization of multidimensional array list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0; i < 3; i++){
            list.add(new ArrayList<>());
        }


        for (int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(s.nextInt());
            }
        }

        System.out.println(list);


    }

}
