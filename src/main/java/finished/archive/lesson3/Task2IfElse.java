package finished.archive.lesson3;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через if-else
 */
public class Task2IfElse {
    public static void main(String[] args) {
        System.out.println(getMessage());

    }

    public static String getMessage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String message = scanner.nextLine();

        scanner.close();

        if (message.equals("Hi")) {
            return "Hello";
        }

        if (message.equals("Bye")) {
            return "Good bye";
        }

        if (message.equals("How are you")) {
            return "How are your doing";
        }

        return "Unknown message";
    }
}
