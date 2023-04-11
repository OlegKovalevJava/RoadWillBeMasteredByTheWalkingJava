package org.example.lesson22;

// ОБЕРТКИ ДЛЯ ПРИМИТИВНЫХ ТИПОВ ДАННЫХ

public class Main {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;
        if (i == j) {
            System.out.println("i и j совпадают");
        }

        Integer a = 128;
        Integer b = 128;
        if (a == b) {
            System.out.println("a и b совпадают");
        }

    }
}