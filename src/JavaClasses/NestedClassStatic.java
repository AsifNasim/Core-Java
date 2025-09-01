package JavaClasses;

public class NestedClassStatic {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{
        public void print(){
            System.out.println("Class Variable: "+ classVariable);
        }
    }

    class nonstaticNestedClass{
        public void print(){
            System.out.println("Instance Variable: "+ instanceVariable);
        }
    }

    public void display(){
        NestedClass nestedObj = new NestedClass();
        nestedObj.print();
    }

}
