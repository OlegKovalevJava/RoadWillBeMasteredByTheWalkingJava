package finished.lesson47;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaApp {

    public static void main(String[] args) {

        Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов
    }
}
