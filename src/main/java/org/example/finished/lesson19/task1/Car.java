package org.example.finished.lesson19.task1;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Car {
    private final String number;
    private final int year;
    private String color;
    private boolean actualTechnicalInspection;
    private int hashCode;

    public Car(String number, int year, String color, boolean actualTechnicalInspection, int hashCode) {
        this.number = number;
        this.year = year;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
        this.hashCode = hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }

        Car car = (Car) o;

        return year == car.year && Objects.equals(number, car.number);
    }

}