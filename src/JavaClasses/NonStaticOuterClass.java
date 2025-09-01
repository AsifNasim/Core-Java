package JavaClasses;

public class NonStaticOuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    class NestedClass{
        public void print(){
            System.out.println("Instance Variable: "+ instanceVariable);
            System.out.println("Class Variable: "+ classVariable);
        }
    }


    public void main(String[] args) {
        NonStaticOuterClass.NestedClass nestedObj = new NonStaticOuterClass.NestedClass();
        nestedObj.print();
    }
}
