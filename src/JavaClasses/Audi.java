package JavaClasses;

public class Audi extends LuxuryCar {

    Audi(int mileage){
        super(mileage);
    }


    @Override
    public void displayClutch() {
        System.out.println("Display Clutch");
    }

    @Override
    public void pressDualBrake() {
        System.out.println("Display Dual Brake");
    }
}
