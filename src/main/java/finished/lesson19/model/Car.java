package finished.lesson19.model;

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

    public Car(String number, int year, String color, boolean actualTechnicalInspection) {
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

    @Override
    public int hashCode() {
        if (hashCode == 0) {
            hashCode = number.hashCode();
            hashCode += 31 * year;
        }
        return hashCode;
    }

    @Override
    public String toString() {
        return """
                number: %s
                year: %d
                color: %s
                actualTechnicalInspection: %s
                """
                .formatted(number, year, color, actualTechnicalInspection ? "actual" : "not actual");
    }
}