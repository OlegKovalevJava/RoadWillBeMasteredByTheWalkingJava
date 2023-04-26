package org.example.finished.lesson2;

// ВЫВОД ВЫВОД В КОНСОЛЬ + ФОРМАТИРОВАНИЕ СТРОК

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();

    }
}
// next(): считывает введенную строку до первого пробела
// nextLine(): считывает всю введенную строку
// nextInt(): считывает введенное число int
// nextDouble(): считывает введенное число double
// nextBoolean(): считывает значение boolean
// nextByte(): считывает введенное число byte
// nextFloat(): считывает введенное число float
// nextShort(): считывает введенное число short