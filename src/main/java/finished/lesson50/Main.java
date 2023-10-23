package finished.lesson50;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        List<Person> persons2 = persons.stream()
                .sorted()
                .filter(person -> person.getAge() > 30)
                .toList();

        for (int i = 0; i < persons2.size(); i++) {
            System.out.println(persons2.get(i));
        }
    }
}