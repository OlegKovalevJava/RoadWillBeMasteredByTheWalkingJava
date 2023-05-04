package org.example.finished.lesson13.task1.model;

public class Cat extends Animal {
    private Cat() {
        System.out.println("I'm a cat");
    }

    public Cat(String color) {


        System.out.printf("I'm a %s cat\n", color);
    }
}