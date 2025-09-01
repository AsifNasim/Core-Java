package Inheritence;

public class HierarchialInheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.bark();

        cat.makeSound();
        cat.meow();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
