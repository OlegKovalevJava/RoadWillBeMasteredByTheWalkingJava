package skill.zoo;

public class Dog extends Animal implements Soundable{
    public Dog(int years, String name) {
        super(years, name);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Dog";
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }
}