package org.example.lesson7;

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
        return result * 1000;
    }
}