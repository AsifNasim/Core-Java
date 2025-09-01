public class OOPs {
    interface Animal {
        public void eat();
        public void sleep();

    }

    class Dog implements Animal {
        public void eat() {
            System.out.println("Dog is eating");
        }

        public void sleep() {
            System.out.println("Dog is sleeping");
        }

    }

    public static void main(String [] args ){
        OOPs oops = new OOPs();
        Dog dog = oops.new Dog();
        dog.eat();
        dog.sleep();
    }


}
