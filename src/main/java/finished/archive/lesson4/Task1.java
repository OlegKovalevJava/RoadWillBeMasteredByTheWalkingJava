package finished.archive.lesson4;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Ввести с клавиатуры целое число.
 * Вывести в консоль его факториал.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 0) { //Факториал отрицательного числа не существует
            System.out.println("The number must be at least 0");
        }

        if (number == 0) {
            System.out.println(1);
        }

        int result = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);

        System.out.println(result);
    }
}