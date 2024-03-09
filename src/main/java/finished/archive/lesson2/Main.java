package finished.archive.lesson2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        final int i = powRec(5, 3);
        System.out.println(i);
    }

    public static int powRec(int value, int powValue) {
        if (powValue == 1) {
            return value;
        }

        return value * powRec(value, powValue - 1);
    }

    public static int pow(int value, int powValue) {
        BigInteger a = new BigInteger(String.valueOf(value));
        return a.pow(powValue).intValue();
    }
}
