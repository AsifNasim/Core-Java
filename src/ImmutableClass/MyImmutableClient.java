package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class MyImmutableClient {
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("an");
        petNames.add("zf");

        MyImmutableClass obj = new MyImmutableClass("myName", petNames);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }
}
