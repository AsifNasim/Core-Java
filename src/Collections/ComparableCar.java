package Collections;

public class ComparableCar implements Comparable<ComparableCar> {

    String carName;
    String carType;

    ComparableCar(String carName, String carType){
        this.carName = carName;
        this.carType = carType;
    }

    @Override
    public  int compareTo(ComparableCar o2){
        return this.carType.compareTo(o2.carType);
    }
}
