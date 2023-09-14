package skillFactory.collection2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        keywords.add("Java");
        keywords.add("Java");
        keywords.add("Java");

        printList(keywords);
    }

    private static void printList(Queue<?> keywords) {
        for (Object o : keywords) {
            System.out.println(o);
        }
    }

}