package finished.archive.lesson2;

import java.util.Scanner;

/**
 * Введите с клавиатуры целые числа a и b.
 * Выведите на экран результат сравнения:
 * a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(Math.pow(a, 3) > Math.pow(b, 2));
        System.out.println(Math.pow(a, 3));
        System.out.println(Math.pow(b, 2));

    }

    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }


}