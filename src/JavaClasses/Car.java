package JavaClasses;

public abstract class Car {

    int mileage;

    Car(int mileage){
        this.mileage = mileage;
    }

    public abstract void applyBrake();

    public abstract void displayClutch();

    public int getNumberOfWheels(){
        return 4;
    }

}
