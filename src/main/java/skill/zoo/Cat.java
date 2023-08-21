package skill.zoo;

public class Cat extends Animal implements Soundable {
    public Cat(int years, String name) {
        super(years, name);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Cat";
    }

    @Override
    public void sound() {
        System.out.println("Мя");
    }
}