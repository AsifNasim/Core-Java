package JavaClasses;

public class OuterNestedClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    private static class InnerNestedClass{

        public void print(){
            System.out.println("Class Variable: "+ classVariable);
        }

        public void display(){
            InnerNestedClass nestedObj = new InnerNestedClass();
            nestedObj.print();
        }
    }


    public static void main(String[] args) {
        InnerNestedClass obj = new OuterNestedClass.InnerNestedClass();
        obj.print();
        obj.display();

    }
}
