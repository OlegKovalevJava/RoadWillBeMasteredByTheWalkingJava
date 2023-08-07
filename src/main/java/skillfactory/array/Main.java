package skillfactory.array;

public class Main {
    public static void main(String[] args) {

        Cat tom = new Cat(10.2, "Tom", 3, "Res");
        tom.eat();
        tom.eat();
        tom.eat();
        tom.eat();
        tom.eat();
        System.out.println(tom.getWeight());

    }
}