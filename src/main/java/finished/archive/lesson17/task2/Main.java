package finished.archive.lesson17.task2;

public class Main {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.SMALL;
        CoffeeSize coffeeSize2 = CoffeeSize.MEDIUM;
        CoffeeSize coffeeSize3 = CoffeeSize.BIG;
        System.out.println(coffeeSize.getCoffeeClass());
        System.out.println(coffeeSize2.getCoffeeClass());
        System.out.println(coffeeSize3.getCoffeeClass());
    }
}
