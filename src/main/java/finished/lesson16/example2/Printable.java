package finished.lesson16.example2;

public interface Printable {
    void print();

    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    private int sumAll(int... values) {
        int result = 0;
        for (int n : values) {
            result += n;
        }
        return result;
    }
}