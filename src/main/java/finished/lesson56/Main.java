package finished.lesson56;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listPeople = new ArrayList<>();
        listPeople.add("Tom");
        listPeople.add("Com");
        listPeople.add("Som");
        listPeople.add("Mom");

        listPeople.remove("Som");
        listPeople.remove(0);

        for (String peoples: listPeople) {
            System.out.println(peoples);
        }

    }
}
