package skill;

public class Balance {
    private int right = 0;
    private int left = 0;

    public void addRight(int n) {
        right += n;
    }

    public void addLeft(int n) {
        left += n;
    }

    public String getSituation() {
        if (right == left) {
            return "=";
        }
        if (right > left) {
            return "R";
        } else return "L";
    }
}