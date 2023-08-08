package tank;

public class Tank {
    private int position;

    public Tank(int position) {
        this.position = position;
    }

    public void goForward(int distance) {
        this.position = position + distance;
    }

    public void goBackward(int distance) {
        this.position = position - distance;
    }

    public void printPosition() {
        System.out.printf("The Tank is at %d now.", position);
        System.out.println();
    }
}