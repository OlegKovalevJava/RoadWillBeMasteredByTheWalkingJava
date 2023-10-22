package skill.mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "camry", false);
        Car car2 = new Car(TOYOTA, "camry", true);
        Car car3 = new Car(KIA, "rio", false);
        Car car4 = new Car(KIA, "rio", false);
        Car car5 = new Car(BMW, "x8", false);
        Car car6 = new Car(BMW, "x9", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        Map<Car, Integer> carMap = new HashMap<>();

        for (Car car : carList) {
            if (carMap.containsKey(car)) {
                int value = carMap.get(car);
                carMap.put(car, ++value);
            } else {
                carMap.put(car, 1);
            }
        }

        for (Map.Entry<Car, Integer> carEntry : carMap.entrySet()) {
            System.out.println(carEntry.getKey() + "=" + carEntry.getValue());
        }

    }
}