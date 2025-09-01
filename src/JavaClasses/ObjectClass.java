package JavaClasses;

import Demo.Car;

public class ObjectClass {

    public static void main(String[] args) {
        Object obj1 = new Audi(3);

        Object obj2 = new Car();

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
