package org.example.finished.lesson19.task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Max {
    private String name;
    private int height;
    private int weight;

    public Max(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}