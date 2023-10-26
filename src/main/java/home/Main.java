package home;

public class Main {
    public static void main(String[] args) {
        Example<Car> example = new Example<>();

        Car car1 = new Car("BMW", 2023);
        Car car2 = new Car("Volvo", 2024);

        example.addToString(car1);
        example.addToString(car2);

        System.out.println(example.getString());


    }
}
