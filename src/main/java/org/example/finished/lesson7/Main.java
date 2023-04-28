package org.example.finished.lesson7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("КРАСНЫЙ");
        method1(car);
        System.out.println(car.color);

    }

    static void method1(Car car) {
        car.color = "Желтый";
        System.out.println(car.color);

    }
}