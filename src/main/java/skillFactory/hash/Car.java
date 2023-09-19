package skillFactory.hash;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Car {
    private final String brand;
    private final String name;
    private boolean onSale;

    public Car(String brand, String name, boolean onSale) {
        if (brand == null || name == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", onSale=" + onSale +
                '}';
    }
}