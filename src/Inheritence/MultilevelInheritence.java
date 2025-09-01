package Inheritence;

public class MultilevelInheritence {

    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
        child.parentMethod();
        child.childMethod();
    }

}

class GrandParent{
    public void greet(){
        System.out.println("Hello from GrandParent");
    }
}

class Parent extends GrandParent{
    public void parentMethod(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    public void childMethod(){
        System.out.println("Child Method");
    }
}
