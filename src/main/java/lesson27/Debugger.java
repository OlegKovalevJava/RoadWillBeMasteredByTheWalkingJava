package lesson27;

import java.util.ArrayList;
import java.util.List;

public class Debugger {
    List<String> words = new ArrayList<>();

    void fillingInLines() {
        words.add("name");
        words.add("surname");
        words.add("patronymic");
        for (String words : words) {
            System.out.println(words);
        }
    }
}