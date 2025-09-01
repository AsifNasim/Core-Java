package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
        // this is required, making list final
        // means you can not now point it to the new list, but still can add, delete values in it.
        // so that's why we send the copy of it.

        return new ArrayList<>(petNameList);
    }

}
