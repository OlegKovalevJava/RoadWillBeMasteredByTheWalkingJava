package org.example.lesson2;

public class Main {

    public static void main(String[] args) {

        int a = 1;
        int b = a++;
        b += a++;

       //System.out.println(b);
       // System.out.println(a);

        String name = "Tom";
        int age = 30;
        float height = 1.7f;

        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);

    }
}