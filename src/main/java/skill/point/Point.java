package skill.point;

public class Point {
    protected int a;
    protected int b;

    public Point() {
    }

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void go() {
        System.out.println(a + "\n" + b);
    }

}