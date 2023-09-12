package skillFactory.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        int numberOfTask = 5;

        Queue toDoQueue = new ArrayDeque(numberOfTask);

        Boss boss = new Boss(toDoQueue);

        Worker worker = new Worker(toDoQueue);

        for (int i = 1; i <= numberOfTask; i++) {
            boss.giveTask("Задание " + i);
        }

        System.out.println("Начальник закончил давать задания");

        for (int i = 1; i <= numberOfTask + 1; i++) {
            worker.takeTask();
        }
    }
}