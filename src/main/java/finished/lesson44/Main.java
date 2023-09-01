package finished.lesson44;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "string");
        map.put(2, "string");
        map.put(3, "string");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valueList = new ArrayList<>(map.values());
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        System.out.println(keyList);
        System.out.println(valueList);
        System.out.println(entryList);

    }
}
