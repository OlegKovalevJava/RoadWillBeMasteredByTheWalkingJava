package org.example.finished.lesson21;

import lombok.Getter;

@Getter
public class Computer {
    private final int number = 888;
    private final String name = "ComputerNumberOne";

    public final void printName() {
        System.out.println("final method");
    }
}