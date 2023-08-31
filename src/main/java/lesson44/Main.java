package lesson44;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string");
        map.put(2, "string");
        map.put(3, "string");

        String string1 = map.get(1);
        String string2 = map.get(2);
        String string3 = map.get(3);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

    }
}