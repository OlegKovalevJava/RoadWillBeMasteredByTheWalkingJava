package finished.archive.lesson3;
// ПРИВЕДЕНИЕ ТИПОВ ДАННЫХ

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Lesson3 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = "Test"::equals;

        System.out.println(stringPredicate.test("Test"));
        System.out.println(stringPredicate.test("test"));

        List<Object> names = new LinkedList<>();
        names.add("java");
        names.add("kotlin");

    }
}
