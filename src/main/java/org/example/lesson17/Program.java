package org.example.lesson17;

public class Program {
    public static void main(String[] args) {
        System.out.println(Color.RED.getCode());
        System.out.println(Color.BLUE.getCode());
        System.out.println(Color.GREEN.getCode());

        Color[] colors = Color.values();
        for (Color c : colors) {
            System.out.println(c);
        }
    }
}