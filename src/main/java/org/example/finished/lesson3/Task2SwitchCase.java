package org.example.finished.lesson3;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через switch-case
 */
public class Task2SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        switch (s) {
            case "Hi":
                System.out.println("Hello");
                break;

            case "Bye":
                System.out.println("Good bye");
                break;

            case "How are you":
                System.out.println("How are your doing");
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                System.out.println("Unknown message");
        }
    }
}