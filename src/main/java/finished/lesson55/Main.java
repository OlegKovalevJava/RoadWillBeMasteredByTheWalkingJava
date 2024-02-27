package finished.lesson55;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        boolean isContainsEven = Stream.of(1, 2, 3, 4, 6)
                .anyMatch(i -> i % 2 == 0); // true для 2, больше проверок не будет

        boolean isContains1 = Stream.of(2, 2, 2, 2)
                .anyMatch(i -> i == 1); // false, ни один из элементов не равен 1

        System.out.println(isContainsEven + " " + isContains1);
    }
}
