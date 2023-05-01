package org.example.lesson13.model;

public class Cat extends Animal {
    private Cat() {
        System.out.println("I'm a cat");
    }

    public Cat(String color) {
        this();
    }
}