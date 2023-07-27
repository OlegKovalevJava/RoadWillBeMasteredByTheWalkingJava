package lesson39;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Max");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}