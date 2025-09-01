package JavaClasses;

public abstract class LuxuryCar extends Car{
    LuxuryCar(int mileage) {
        super(mileage);
    }

    public abstract void pressDualBrake();

    @Override
    public void applyBrake(){
        System.out.println("apply brake");
    }


}
