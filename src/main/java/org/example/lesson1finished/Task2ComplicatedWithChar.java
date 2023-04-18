package org.example.lesson1finished;

/**
 * Усложнение для внимательных: вывести ваше имя посимвольно,
 * где каждая буква — на новой строке, не используя System.out.println().
 * Реализуется с использованием char.
 */
public class Task2ComplicatedWithChar {
    public static void main(String[] args) {

        char ch = 'Е';
        System.out.print(ch + "\n");

        ch = 'г';
        System.out.print(ch + "\n");

        ch = 'о';
        System.out.print(ch + "\n");

        ch = 'р';
        System.out.print("" + ch + "\n");

    }
}