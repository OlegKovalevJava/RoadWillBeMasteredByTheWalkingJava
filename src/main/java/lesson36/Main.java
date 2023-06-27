package lesson36;

public class Main {
    public static void main(String[] args) {
        final int x;

        if (Math.random() > 0.5) {
            x = 1;
        } else {
            x = 2;
        }

        System.out.println(x);
    }
}