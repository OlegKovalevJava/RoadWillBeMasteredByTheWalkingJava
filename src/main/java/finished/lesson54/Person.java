package finished.lesson54;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return firstName + " " + lastName + " возраст: " + age;
    }

    @Override
    public int compareTo(Person o) {
        return firstName.compareTo(o.getFirstName());
    }
}
