package skillFactory.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camri", false);
        Car car2 = new Car(TOYOTA, "Camri", false);
        Car car3 = new Car(BMW, "BMW", false);
        Car car4 = new Car(BMW, "BMW", true);
        Car car5 = new Car(KIA, "KIA", true);
        Car car6 = new Car(KIA, "KIA", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        Set<Car> carSet = new HashSet<>(carList);
        for (Car car : carSet) {
            System.out.println(car);
        }

    }
}