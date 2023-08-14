package skill.point;

public class PointColor extends Point{
    String color;

    public PointColor(int a, int b, String color) {
        super(a, b);
        this.color = color;
    }

    public void goColor() {
        super.go();
        System.out.println(color);
    }
}