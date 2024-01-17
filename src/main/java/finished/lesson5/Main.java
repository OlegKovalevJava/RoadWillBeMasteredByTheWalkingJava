package finished.lesson5;

public class Main {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};
        System.out.println(number.length);

        int last = number[number.length - 1];
        System.out.println(last);

        for (int i : number) {
            System.out.println(i);
        }

        int n = 10;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            System.out.println(i * j);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }

    }
}