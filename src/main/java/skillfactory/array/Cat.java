package skillfactory.array;

public class Cat {
    private double weight;
    private String name = "NO";

    public Cat() {
    }

    public Cat(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
