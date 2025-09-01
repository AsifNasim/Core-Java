package Inheritence;

public class SingleInheritence {

    class Parent{
        public void parentMethod(){
            System.out.println("Parent Method");
        }
    }

    class Child extends Parent{
        public void childMethod(){
            System.out.println("Child Method");
        }
    }

    public static void main(String[] args) {
        SingleInheritence singleInheritence = new SingleInheritence();
        Child child = singleInheritence.new Child();
        child.parentMethod();
    }

}


