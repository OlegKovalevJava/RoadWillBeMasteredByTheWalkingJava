package finished.archive.lesson6;

import java.util.Scanner;

/**
 * Декомпозировать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task2SwitchCase.java">...</a>
 * Вынести в отдельный метод использование switch-case.
 * Также вынести в отдельный метод использование System.out.println
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String greeting = scanner.nextLine();

        scanner.close();

        printAnswer(greeting);
    }

    static void printAnswer(String greeting) {
        String answer = switch (greeting) {
            case "Hi" -> "Hello";
            case "Bye" -> "Good bye";
            case "How are you" -> "How are your doing";
            default -> "Unknown message";
        };

        log(answer);

    }

    static void log(String message) {
        System.out.println(message);
    }
}
