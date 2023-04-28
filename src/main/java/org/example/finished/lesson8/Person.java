package org.example.finished.lesson8;

public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name) {
        this(name, 18);

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

}