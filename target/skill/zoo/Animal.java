package skill.zoo;

abstract class Animal {
    int years;
    String name;

    public Animal() {
    }

    public Animal(int years, String name) {
        this.years = years;
        this.name = name;
    }

    abstract void print();

}