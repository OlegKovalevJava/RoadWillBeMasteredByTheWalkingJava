package finished.lesson55;

public interface Runnable {
    void go();

    static void run() {
        System.out.println("RUN");
    }
}
