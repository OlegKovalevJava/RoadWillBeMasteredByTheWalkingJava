package finished.archive.lesson14.task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
    private int age;

    public void sound() {
        System.out.println("I'm HUMAN!");
    }

}