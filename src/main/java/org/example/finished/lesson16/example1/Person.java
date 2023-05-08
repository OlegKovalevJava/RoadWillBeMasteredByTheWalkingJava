package org.example.finished.lesson16.example1;

import lombok.Getter;

@Getter
abstract public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();

}