package Constructor;

public class ConstructorOverloaded {

    String name;
    int id;

    ConstructorOverloaded(String empName){
        name = empName;
    }

    ConstructorOverloaded(String empName, int id){
        name = empName;
        id = id;
    }
}

//*** constructor cannot be overrided because it cannot be inherited and its instance
//cannot be created.
