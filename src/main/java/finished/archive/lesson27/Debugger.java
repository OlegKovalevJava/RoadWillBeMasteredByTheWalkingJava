package finished.archive.lesson27;

import java.util.ArrayList;
import java.util.List;

public class Debugger {
    List<String> words = new ArrayList<>();

    int[] myArray = new int[2];

    void fillingInLines() {
        words.add("name");
        for (String words : words) {
            System.out.println(words);
        }
    }

    void fillingInNumbers() {
        myArray[0] = 111;
        myArray[1] = 222;

        for (int numbers : myArray) {
            System.out.println("если myArray " + myArray);
            System.out.println("если numbers " + numbers);
        }
    }
}