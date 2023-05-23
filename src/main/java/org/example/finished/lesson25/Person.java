package org.example.finished.lesson25;

public class Person {
    private String name;
    Account account;

    Person() {
    }

    Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    void go(int number) {
        System.out.println("выбранный номер: " + number);
    }

    void displayPerson() {
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    class Account {
        private String password;

        Account(String password) {
            this.password = password;
        }

        void displayAccount() {
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }
    }
}