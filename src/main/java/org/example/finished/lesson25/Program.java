package org.example.finished.lesson25;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.go(123);

        Person person1 = new Person() {
            void go(int number) {
                System.out.println("при использовании метода с анонимным классом: " + number);
            }
        };
        person1.go(444);
    }
}