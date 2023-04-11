package org.example.lesson22;

// ОБЕРТКИ ДЛЯ ПРИМИТИВНЫХ ТИПОВ ДАННЫХ

public class Main {
    public static void main(String[] args) {
        Integer i = 5;
        Integer j = 5;
        if (i.equals(j)) {
            System.out.println("СОВПАДАЮТ");
        }
        if (i == j) {
            System.out.println("СОВПАДАЮТ");
        }
    }
}