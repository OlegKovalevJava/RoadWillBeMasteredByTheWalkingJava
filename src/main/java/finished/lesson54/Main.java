package finished.lesson54;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons().stream()
                .filter(person -> person.getAge() > 40 && person.getAge() < 100)
                .toList();

        persons.forEach(System.out::println);
    }
}
