package org.example.lesson4finished;

import java.util.Scanner;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры после выводом на экран "Не угадал!"
 */
public class Task5Var2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Не угадал!");
        } while (input.nextInt() != 1);

        input.close();
    }
}