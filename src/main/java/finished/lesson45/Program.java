package finished.lesson45;

public class Program {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addElectricityListeners(lamp);
        sw.addElectricityListeners(radio);

        sw.addElectricityListeners(new ElectricityConsumer() {
            public void electricityOn() {
                System.out.println("Пожар");
            }
        });

        sw.addElectricityListeners(() -> System.out.print("Fire"));

        sw.switchOn();

    }

}