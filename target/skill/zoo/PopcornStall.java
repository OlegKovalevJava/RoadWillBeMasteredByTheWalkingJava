package skill.zoo;

public class PopcornStall implements Soundable{
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "It's PopcornStall";
    }

    @Override
    public void sound() {
        System.out.println("Попкорн!");
    }
}