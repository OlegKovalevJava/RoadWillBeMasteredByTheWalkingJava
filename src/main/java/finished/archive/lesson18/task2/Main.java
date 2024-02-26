package finished.archive.lesson18.task2;

import finished.archive.lesson18.task2.model.Animal;
import finished.archive.lesson18.task2.model.Cat;
import finished.archive.lesson18.task2.model.Cow;
import finished.archive.lesson18.task2.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};
        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            soundNow(animal);
        }
    }

    private static void soundNow(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else {
            System.out.println("Unknown animal!");
        }
    }
}
