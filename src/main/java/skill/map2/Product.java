package skill.map2;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
public class Product implements Comparable<Product> {

    private final String brand;
    private final String name;
    private final long serialNumber;
    private final LocalDateTime creationDate;

    public Product(String brand, String name, long serialNumber, LocalDateTime creationDate) {
        if (brand == null || name == null || serialNumber == 0 || creationDate == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.serialNumber = serialNumber;
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return serialNumber == product.serialNumber && brand.equals(product.brand) && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name, serialNumber);
    }

    @Override
    public String toString() {
        return "Product{" + "brand='" + brand + '\'' + ", name='" + name + '\'' + ", serialNumber=" + serialNumber
                + ", creationDate=" + creationDate + '}';
    }

    @Override
    public int compareTo(Product o) {
        return brand.compareTo(o.brand);
    }
}