package finished.lesson55;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] arr0 = Stream.of(1, 2, 10)
                .toArray(Integer[]::new);

        Integer[] arr1 = Stream.of(1, 2, 10)
                .toArray(length -> new Integer[length]);

        String[] arr2 = Stream.of("11", "22", "101")
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arr0));

        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));

    }
}
