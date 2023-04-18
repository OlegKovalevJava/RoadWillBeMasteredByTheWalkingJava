package org.example.lesson2finished;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два целых числа. Если Число1 четное,
 * вывести произведение двух чисел(пр.1) если нет - частное(пр.2).
 * Также если числа равны - вывести надпись "числа равны!"
 * <p>
 * пр1.: "Число1 * Число2 = Произведение",
 * где число1 - значение 1го числа, число2 - значение 2го числа,
 * Произведение - результат умножения.
 * <p>
 * пр2.: "Число1 / Число2 = Частное",
 * где число1 - значение 1го числа, число2 - значение 2го числа,
 * Частное - результат деления.
 * <p>
 * Помните, что результат деления двух чисел – тоже целое число.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

        if (a % 2 == 0) {
            System.out.printf("Число1 * Число2 = %d", a * b);
        } else if (b == 0) {
            System.out.print("Деление на 0 недопустимо!");
        } else {
            System.out.printf("Число1 / Число2 = %f", (double) a / b);
        }

        if (a == b) {
            System.out.print("\nЧисла равны!");
        }
    }
}