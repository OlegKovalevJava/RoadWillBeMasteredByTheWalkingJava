package finished.archive.lesson3;

import java.util.Scanner;

/**
 * Завести три переменные типа String.
 * С клавиатуры ввести в них вашу фамилию, имя и отчество.
 * Вывести в консоль в одну строку ваше ФИО.
 * Сделать, используя System.out.printf
 */
public class Task3Printf {
    public static void main(String[] args) {
        System.out.println(getFIO());
    }

    public static String getFIO() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter patronymic: ");
        String patronymic = scanner.nextLine();

        scanner.close();

        return "Фамилия: " + lastName +
               "\nИмя: " + firstName +
               "\nОтчество: " + patronymic;

    }
}