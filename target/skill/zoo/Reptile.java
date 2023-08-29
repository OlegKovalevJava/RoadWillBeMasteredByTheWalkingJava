package skill.zoo;

public class Reptile extends Animal {
    public Reptile(int years, String name) {
        super(years, name);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Reptile";
    }
}