package Collections.StreamExample;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(100);
        salaryList.add(400);
        salaryList.add(200);
        salaryList.add(700);
        salaryList.add(900);
        salaryList.add(800);

        int count = 0;

//        Operations without stream
        for (Integer salary: salaryList){
            if (salary > 300){
                count = count+1;
            }
        }

        System.out.println("Without Stream: " +count);
//        Operations with Stream

        long output = salaryList.stream().filter((Integer sal) -> sal>300).count();
        System.out.println("With Stream: "+ output);




    }
}
