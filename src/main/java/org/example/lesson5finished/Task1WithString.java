package org.example.lesson5finished;

/**
 * Создать массив char, заполненный буквами своего имени в верном порядке.
 * Используя этот массив, вывести свое имя в консоль.
 * Предварительно собрать значения массива в переменную типа String.
 */
public class Task1WithString {
    public static void main(String[] args) {

        char[] nameArray = new char[]{'O', 'L', 'E', 'G'};

        String name = "";

        for (char ch : nameArray) {
            if (ch == 'E')
                continue;
            name += ch;
        }

        System.out.println(name);

        int[] num = {10, 190};

        int res = 0;

        for (int i : num) {
            res += i;
        }

        System.out.println(res);
    }
}