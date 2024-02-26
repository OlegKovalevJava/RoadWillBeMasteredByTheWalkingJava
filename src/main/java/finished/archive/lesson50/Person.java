package finished.archive.lesson50;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "'firstName:' " + firstName + " 'lastName:' " + lastName + " 'age:' " + age;
    }

    @Override
    public int compareTo(Person o) {
        return firstName.compareTo(o.getFirstName());
    }
}