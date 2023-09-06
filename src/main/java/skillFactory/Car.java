package skillFactory;

public class Car {
    private int wheels;
    private String carName;

    public Car(int wheels, String carName) {
        this.wheels = wheels;
        this.carName = carName;
    }

    void giveMeInformation(int wheels, String carName) {
        System.out.printf("количество колес %d имя машины: %s", wheels, carName);
    }

    @Override
    public String toString() {
        return "wheels " + wheels + " carName " + carName;
    }
}