package org.example.finished.lesson7;

public class Program {

    static void display(String name, int age) {
        System.out.print(name + " ");
        System.out.println(age);
    }

    static int sum(int... numbers) {
        int result = 0;
        for (int x : numbers)
            result += x;
        System.out.println(result);
        return result;
    }

    static int sum(int x, int y) {

        return x + y;
    }

    static double sum(double x, double y) {

        return x + y;
    }

    static int sum(int x, int y, int z) {

        return x + y + z;
    }
}