package skillFactory.collection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] chars = new char[3];

        chars[0] = 'a';
        chars[1] = 'A';
        chars[2] = 's';

        Arrays.sort(chars);
        System.out.println(chars);

    }
}