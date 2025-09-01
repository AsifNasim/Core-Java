package Constructor;

public class ParameterisedConstructor {
    String firstName;
    String lastName;

//    1. when we define any constructor the default constructor is not
//    added.

    public ParameterisedConstructor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
