package tank;

import lombok.*;

@Getter
@Setter
public class Tank {
    private int x;
    private int y;
    private int dir;
    private int fuel = 100;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void goForward(int i) {
        if (i < 0 && -i > -fuel) { // 101
            i = -fuel;
        } else if (i > fuel) {
            i = fuel;
        }

        if (dir == 0) {
            x += i;
        } else if (dir == 1) {
            y += i;
        } else if (dir == 2) {
            x -= i;
        } else y -= i;

        fuel = fuel - Math.abs(i);
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }
}