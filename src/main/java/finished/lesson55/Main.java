package finished.lesson55;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isFoo = "Java"::equals;

        System.out.println(isFoo.test("Java"));
        System.out.println(isFoo.test("lava"));
        System.out.println(isFoo.test("ava"));

    }
}
