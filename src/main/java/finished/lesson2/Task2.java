package finished.lesson2;

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

        System.out.println(a * a * a > b * b);

    }
}