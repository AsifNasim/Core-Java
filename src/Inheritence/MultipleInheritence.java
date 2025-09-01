package Inheritence;

public class MultipleInheritence {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.methodA();
        concreteClass.methodB();
    }
}


interface A{
    public void methodA();
}

interface B{
    public void methodB();
}

class ConcreteClass implements A, B {

    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}
