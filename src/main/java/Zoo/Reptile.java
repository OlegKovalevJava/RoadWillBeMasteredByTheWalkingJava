package Zoo;

public class Reptile extends Animal {
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Reptile";
    }
}