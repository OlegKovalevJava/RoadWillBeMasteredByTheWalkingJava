package finished.lesson50;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Data.getPersons();

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
}