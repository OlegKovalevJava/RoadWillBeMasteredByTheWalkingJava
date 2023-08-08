package tank;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank(0);
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
}
