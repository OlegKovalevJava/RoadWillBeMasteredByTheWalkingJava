package finished.archive.lesson3;

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
        System.out.println(getMessage());
    }

    public static String getMessage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String message = scanner.nextLine();

        scanner.close();

        return switch (message) {
            case "Hi":
                yield "Hello";
            case "Bye":
                yield "Good bye";
            case "How are you":
                yield "How are your doing";
            default:
                yield "Unknown message";
        };

    }
}