package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorCarClient {
    public static void main(String[] args) {
        ComparatorCar [] carArray = new ComparatorCar[3];

        carArray[0] = new ComparatorCar("Suv", "petrol");
        carArray[1] = new ComparatorCar("HatchBack", "Diesel");
        carArray[2] = new ComparatorCar("Sedan", "CNG");

//        Arrays.sort(carArray);
//        The above line gives below error as it doesn't able to
//        find comparable method to swap two objects

        /*
        * Exception in thread "main" java.lang.ClassCastException: Collections.ComparatorCar cannot be cast to java.lang.Comparable
	at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.util.Arrays.sort(Arrays.java:1246)
	at Collections.ComparatorCarClient.main(ComparatorCarClient.java:13)*/

//      The Car object array has been sorted in descending order
//        Arrays.sort(carArray, (ComparatorCar obj1, ComparatorCar obj2) -> obj2.carType.compareTo(obj1.carType));
//        Arrays.sort(carArray, (ComparatorCar obj1, ComparatorCar obj2) -> obj2.carName.compareTo(obj1.carName));
//
//        for (ComparatorCar car : carArray) {
//            System.out.println("Car Name:" + car.carName + "Car Type:" + car.carType);
//        }


        List<ComparatorCar> cars = new ArrayList<>();
        cars.add(new ComparatorCar("Suv", "petrol"));
        cars.add(new ComparatorCar("HatchBack", "CNG"));
        cars.add(new ComparatorCar("Sedan", "Diesel"));

        Collections.sort(cars, new ComparatorCarImplementation());

        cars.forEach((ComparatorCar carObj) -> System.out.println(carObj.carName+" "+ carObj.carType));






    }
}
