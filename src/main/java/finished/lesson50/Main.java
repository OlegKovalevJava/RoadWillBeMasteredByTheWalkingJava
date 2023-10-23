package finished.lesson50;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        List<Person> persons2 = persons.stream()
                .sorted()
                .filter(person -> person.getAge() > 40)
                .toList();

        persons2.forEach(System.out::println);
    }
}