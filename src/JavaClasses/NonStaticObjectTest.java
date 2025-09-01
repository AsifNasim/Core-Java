package JavaClasses;

public class NonStaticObjectTest {

    public static void main(String[] args) {
        NonStaticOuterClass nestedObj = new NonStaticOuterClass();
        NonStaticOuterClass.NestedClass nestedClassObj = new NonStaticOuterClass().new NestedClass();
        nestedClassObj.print();
    }
}
