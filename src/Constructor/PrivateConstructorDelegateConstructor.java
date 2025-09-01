package Constructor;

public class PrivateConstructorDelegateConstructor {

    private final String value;
    private final String type;

    public PrivateConstructorDelegateConstructor(int x){
        this(Integer.toString(x), "int");
    }

    public PrivateConstructorDelegateConstructor(boolean x){
        this(Boolean.toString(x), "boolean");
    }

    private PrivateConstructorDelegateConstructor(String value, String type){
        this.value = value;
        this.type = type;
    }

}
