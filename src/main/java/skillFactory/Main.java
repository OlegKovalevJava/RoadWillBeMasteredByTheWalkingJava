package skillFactory;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Car car1 = new Car(4, "max");
        Car car2 = new Car(6, "MIX");
        cars.add(car1);
        cars.add(car1);
        cars.add(car1);
        cars.add(car2);
        cars.add(car2);
        cars.add(car2);
        for (Car c: cars) {
            System.out.println(c.toString());
        }
    }

}