package skill;

public class Human {
    private String name;
    private int age;
    private double weight;
    private String address;
    private String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 50;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.age = 30;
        this.weight = 50;
    }

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.weight = 50;
    }

    public Human(int age, double weight, String address, String work) {
        this.name = "Ivan";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    @Override
    public String toString() {
        return "name " + name + ", age " + age + ", weight " + weight + ", address "
                + address + ", work " + work;
    }
}