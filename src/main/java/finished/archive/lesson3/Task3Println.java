package finished.archive.lesson3;

import java.util.Scanner;

/**
 * Завести три переменные типа String.
 * С клавиатуры ввести в них вашу фамилию, имя и отчество.
 * Вывести в консоль в одну строку ваше ФИО.
 * Сделать, используя System.out.println
 */
public class Task3Println {
    public static void main(String[] args) {
        System.out.println(getNameLastNameCity());
    }

    public static String getNameLastNameCity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        scanner.close();

        return "Фамилия: " + lastName +
                "\nИмя: " + firstName +
                "\nГород: " + city;

    }
}
