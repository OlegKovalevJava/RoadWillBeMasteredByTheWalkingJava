package finished.archive.lesson43;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<>();

        states.put(1, "Germany");
        states.put(2, "Spain");

        String first = states.get(1);
        System.out.println(first);

        Set<Integer> keys = states.keySet();

        Collection<String> values = states.values();

        states.replace(1, "Poland");

        states.remove(2);

        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<Object, Object> people = new HashMap<>();

        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));

        for (Map.Entry<Object, Object> item : people.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().toString());
        }

    }
}