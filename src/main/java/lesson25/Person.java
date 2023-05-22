package lesson25;

public class Person {
    private String name;
    Account account;
    int age;

    Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson() {
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account {
        private String password;
        int age;

        Account(String password) {
            this.password = password;
        }

        void displayAccount() {
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }
    }
}