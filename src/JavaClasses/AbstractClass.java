package JavaClasses;

public class AbstractClass {

    interface  Car{
        public  void applyBrake();
    }

    class BMW implements Car{
        @Override
        public void applyBrake(){
            System.out.println("Applying brake");
        }
    }

    abstract class CarNew{

        abstract void accelerate();


    }

    class Audi extends CarNew{

        @Override

        public void accelerate(){
            System.out.println("Car is accelerating");
        }
    }
}
