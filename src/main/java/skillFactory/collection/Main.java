package skillFactory.collection;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new LinkedList<>();
        stringList.add("name");
        stringList.add("surname");
        stringList.add("city");
        stringList.add("name");

        for (String s : stringList) {
            System.out.println(s);
        }
    }

}