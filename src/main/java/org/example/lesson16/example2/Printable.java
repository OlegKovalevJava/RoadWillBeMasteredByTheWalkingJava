package org.example.lesson16.example2;

public interface Printable {

    void print();

    int OPEN = 1;
    int CLOSED = 0;

    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }

    private int sumAll(int... values) {
        int result = 0;
        for (int n : values) {
            result += n;
        }
        return result;
    }
}