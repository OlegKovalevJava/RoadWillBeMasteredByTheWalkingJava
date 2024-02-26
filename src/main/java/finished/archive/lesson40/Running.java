package finished.archive.lesson40;

public interface Running {
    void run();
    default void noRun() {
        System.out.println("NOOOO");
    }
}
