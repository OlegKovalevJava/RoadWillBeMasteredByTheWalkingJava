package finished.lesson3;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = scanner.nextLine();

        scanner.close();

        if ("Hi".equals(s)) {   // Если значение s совпадает с "Hi" Выводим в консоль "Hello"
            System.out.println("Hello");
        } else if ("Bye".equals(s)) {   // Если значение s не равно "Hi", но равно "Bye"
            System.out.println("Good bye");
        } else if ("How are you".equals(s)) {
            System.out.println("How are your doing");
        } else {    // Во всех иных случаях
            System.out.println("Unknown message");
        }
    }

}