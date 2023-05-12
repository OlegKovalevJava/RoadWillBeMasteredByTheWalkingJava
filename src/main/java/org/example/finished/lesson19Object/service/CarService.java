package org.example.finished.lesson19Object.service;

import org.example.finished.lesson19Object.model.Car;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public Car findCar(Car car) {
        for (Car c : cars) {
            if (c.hashCode() == car.hashCode() && c.equals(car)) {
                return c;
            }
        }
        return null;
    }
}
