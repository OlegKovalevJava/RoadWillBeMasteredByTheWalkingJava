package skillfactory.array;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        
        String name = "ВАСЯ";
        long weight = 100;

//        System.out.println(name + " " + weight);

        String b = "Вело";

//        System.out.println(b.charAt(0));

        System.out.println(Arrays.toString("Привет".getBytes(StandardCharsets.UTF_8)));
    }
}
