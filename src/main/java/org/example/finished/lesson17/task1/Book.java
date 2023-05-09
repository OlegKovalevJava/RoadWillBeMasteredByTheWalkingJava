package org.example.finished.lesson17.task1;

class Book {
    String name;
    Type bookType;
    String author;

    Book() {
    }

    Book(String name, String author, Type bookType) {
        this.bookType = bookType;
        this.name = name;
        this.author = author;
    }
}