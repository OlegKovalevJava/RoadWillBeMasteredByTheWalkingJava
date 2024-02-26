package finished.archive.lesson38;

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Tom"));
        people.add(new Person("Tom"));
        people.add(new Person("Mot"));
        people.add(new Person("Cat"));
        people.add(new Person("finished/archive/lesson6/skillFactory/tank/cat"));

        for(Person  p : people) {
            System.out.println(p.getName());

        }
    }
}
