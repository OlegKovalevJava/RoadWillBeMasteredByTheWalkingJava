package org.example.lesson3finished;

import java.util.Scanner;

/**
 * Завести три переменные типа String.
 * С клавиатуры ввести в них вашу фамилию, имя и отчество.
 * Вывести в консоль в одну строку ваше ФИО.
 * Сделать, используя System.out.println
 */
public class Task3Println {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter patronymic: ");
        String patronymic = scanner.nextLine();

        scanner.close();

        System.out.println(lastName + " " + firstName + " " + patronymic);
    }
}
