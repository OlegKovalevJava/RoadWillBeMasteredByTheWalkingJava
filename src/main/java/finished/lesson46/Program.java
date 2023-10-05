package finished.lesson46;

import finished.lesson46.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Анна", 19));

        persons.stream().
                filter(p -> p.getAge() >= 18).
                sorted(Comparator.comparing(Person::getName)).
                forEach(System.out::println);

        double averageAge = persons.stream().
                filter(p -> p.getAge() >= 18).
                mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(averageAge);

    }
}