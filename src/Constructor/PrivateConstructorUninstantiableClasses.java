package Constructor;

import java.util.Locale;

public class PrivateConstructorUninstantiableClasses {

//    1. Uninstantiable Classes are those classes that we cannot instantiate
//    it simply contains couple of static method and for static method we don't
//    need to create object of a class. we can simply call it with the class name


    private PrivateConstructorUninstantiableClasses(){

    }

    public static String toUpperCase(String s){
        return s.toUpperCase();
    }

    public static String toLowerCase(String s){
        return s.toLowerCase();
    }
}
