package org.example.lesson18.task2.model;

public class Animal {
    private final String sound;

    protected Animal(String sound) {
        this.sound = sound;
    }

    protected void sound() {
        System.out.println(sound);
    }
}
