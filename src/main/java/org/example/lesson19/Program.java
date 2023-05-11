package org.example.lesson19;

public class Program {
    public static void main(String[] args) {
        Max max = new Max("NewMax", 150, 100);
        System.out.println("toString - " + max.toString());
        System.out.println("hashCode - " + max.hashCode());
        System.out.println("getClass - " + max.getClass());

        Max max1 = new Max("NewMax", 150, 100);
        System.out.println(max.equals(max1));
        System.out.println(max.equals(max));
    }
}