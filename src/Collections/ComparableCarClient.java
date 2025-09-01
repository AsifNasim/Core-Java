package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableCarClient {

    public static void main(String[] args) {
        List<ComparableCar> carList = new ArrayList<>();
        carList.add(new ComparableCar("Suv", "diesel"));
        carList.add(new ComparableCar("Sedan", "petrol"));
        carList.add(new ComparableCar("HatchBack", "cng"));

        Collections.sort(carList);

        carList.forEach((ComparableCar car) -> System.out.println(car.carName));

    }

}
