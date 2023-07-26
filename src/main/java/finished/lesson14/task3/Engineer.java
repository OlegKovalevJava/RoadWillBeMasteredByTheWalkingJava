package finished.lesson14.task3;

public class Engineer extends Human{
    @Override
    public void sound() {
        super.sound();
        System.out.println("I'm not HUMAN I'm Engineer!!!!");
    }
}