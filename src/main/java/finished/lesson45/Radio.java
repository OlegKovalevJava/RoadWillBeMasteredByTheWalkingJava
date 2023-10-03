package finished.lesson45;

public class Radio implements ElectricityConsumer {

    public void playRadio() {
        System.out.println("Радио играет");
    }

    @Override
    public void electricityOn() {
        playRadio();
    }

}