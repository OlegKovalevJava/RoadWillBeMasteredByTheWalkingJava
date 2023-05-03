package org.example.finished.lesson2;

import java.util.Scanner;

/**
 * Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
 *         c = b*a*(a + b)/(a2),         где a2 - a в квадрате
 * Совпадает ли результат выражения, если a и b — переменные типа int
 * (для проверки не забудьте также использовать подходящий метод Scanner)?
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        scanner.close();

        double c = b * a * (a + b) / (a * a);

        System.out.println(c);

    }
}