package finished.archive.lesson45;

public class Lamp implements ElectricityConsumer {

    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }

}