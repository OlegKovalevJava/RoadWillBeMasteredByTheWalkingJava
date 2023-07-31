package lesson41;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Maz");
        set.add("Maz");
        set.add("maz");
        set.add("maz");
        System.out.println(set);

    }
}
