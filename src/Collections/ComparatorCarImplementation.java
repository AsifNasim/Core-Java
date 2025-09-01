package Collections;

import java.util.Comparator;

public class ComparatorCarImplementation implements Comparator<ComparatorCar> {
    @Override
    public int compare(ComparatorCar o1, ComparatorCar o2){
        return o2.carName.compareTo(o1.carName);
    }

}
