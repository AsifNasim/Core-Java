package Collections.Demo;

import java.util.Arrays;

public class ObjectSortingClient {
    public static void main(String[] args) {
        ObjectSorting [] carArray = new ObjectSorting[3];

        carArray[0] = new ObjectSorting("Defender", "SUV");
        carArray[1] = new ObjectSorting("Verna", "Sedan");
        carArray[2] = new ObjectSorting("WagonR", "HatchBack");

        Arrays.sort(carArray);

    }
}


