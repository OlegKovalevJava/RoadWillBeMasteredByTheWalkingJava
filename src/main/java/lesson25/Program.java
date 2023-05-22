package lesson25;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();
        tom.age = 34;
        tom.account.age = 35;
    }
}