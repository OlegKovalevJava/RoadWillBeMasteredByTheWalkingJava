package Zoo;

public class Cat extends Animal {
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Cat";
    }
}