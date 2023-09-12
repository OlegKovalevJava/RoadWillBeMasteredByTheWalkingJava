package skillFactory.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque();
        System.out.println(((ArrayDeque<?>) queue).pop());
    }
}