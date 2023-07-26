package finished.lesson32;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Используя класс Car (или создав новый класс для сущности «машина», на ваше усмотрение) из задачи
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson19_object_methods/model">...</a>
 * Реализуйте сохранение массива машин в файл carCatalog.txt
 */
public class Main {
    public static final String CAR_CATALOG_FILE_PATH =
            "C:\\Programming\\RoadWillBeMasteredByTheWalkingJava\\src\\main\\resources\\carCatalog.txt";

    public static void main(String[] args) {

        Car[] cars = initCars();

        System.out.println("File writing started");

        try (FileOutputStream fileOutputStream = new FileOutputStream(CAR_CATALOG_FILE_PATH)) {
            for (Car car : cars) {
                fileOutputStream.write(mapCarToFileView(car).getBytes());
                fileOutputStream.write('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException("Error of file writing", e);
        }

        System.out.println("File writing finished");
    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "yellow", true);
        Car car2 = new Car("RR-222-RR", 2016, null, true);

        return new Car[]{car1, car2};
    }

    private static String mapCarToFileView(Car car) {
        return "%s;%d;%s;%s".formatted(
                car.getNumber(), car.getYear(), car.getColor(), car.isActualTechnicalInspection());
    }
}