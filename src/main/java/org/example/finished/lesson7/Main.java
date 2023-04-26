package org.example.finished.lesson7;

public class Main {
    public static void main(String[] args) {

        Car orangeCar = new Car();
        orangeCar.km = 100;
        int a = Car.speed = 333;
        int b = Car.speed = 888;

        Car blueCar = new Car();
        blueCar.km = 85;


        System.out.println("Orange car - " + orangeCar.km);
        System.out.println("Orange speed - " + a);
        System.out.println("Blue car - " + blueCar.km);
        System.out.println("Blue speed - " + b);
    }
}