package org.example.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "Tom";
        int age = 30;
        float height = 1.7f;
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();

    }
}