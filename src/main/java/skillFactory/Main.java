package skillFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = {0, 1, 2, 3, 4};
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println(s);
    }

}